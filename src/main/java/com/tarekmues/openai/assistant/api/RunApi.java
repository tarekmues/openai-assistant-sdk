package com.tarekmues.openai.assistant.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tarekmues.openai.assistant.model.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.codec.ServerSentEvent;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

public class RunApi {

    private final WebClient client;

    private final ObjectMapper mapper;

    public RunApi(WebClient webClient, ObjectMapper mapper) {
        this.client = webClient;
        this.mapper = mapper;
    }

    //TODO implement proper return type
    public Flux<Object> initThreadAndRunStreaming(OpenAIStreamingRunCreationBody body) {
        return client.post()
                .uri("/threads/runs")
                .body(BodyInserters.fromValue(body))
                .retrieve()
                .bodyToFlux(new ParameterizedTypeReference<ServerSentEvent<String>>() {})
                .map(this::processSSE);
    }

    //TODO implement proper return type
    public Flux<Object> createRunStreaming(String threadId, OpenAIStreamingRunCreationBody body) {
        return client.post()
                .uri(builder -> builder.path("/threads/{threadId}/runs").build(threadId))
                .body(BodyInserters.fromValue(body))
                .retrieve()
                .bodyToFlux(new ParameterizedTypeReference<ServerSentEvent<String>>() {
                })
                .map(this::processSSE);
    }

    private Object processSSE(ServerSentEvent<String> event) {
        if (event.event() != null) {
            try {
                return switch (event.event()) {

                    case "thread.created":
                        yield this.mapper.readValue(event.data(), OpenAIThread.class);

                    case "thread.run.created":
                    case "thread.run.queued":
                    case "thread.run.in_progress":
                    case "thread.run.requires_action":
                    case "thread.run.completed":
                    case "thread.run.failed":
                    case "thread.run.cancelling":
                    case "thread.run.cancelled":
                    case "thread.run.expired":
                        yield this.mapper.readValue(event.data(), OpenAIRun.class);

                    case "thread.run.step.created":
                    case "thread.run.step.in_progress":
                    case "thread.run.step.completed":
                    case "thread.run.step.failed":
                    case "thread.run.step.cancelled":
                    case "thread.run.step.expired":
                        yield this.mapper.readValue(event.data(), OpenAIRunStep.class);

                    case "thread.message.created":
                    case "thread.message.in_progress":
                    case "thread.message.completed":
                    case "thread.message.incomplete":
                        yield this.mapper.readValue(event.data(), OpenAIMessage.class);

                    case "thread.message.delta":
                        yield this.mapper.readValue(event.data(), OpenAIMessageDelta.class);

                    case "error":
                        yield this.mapper.readValue(event.data(), Object.class);

                    case "done":
                        //TODO implement proper typing of stream finish event
                        yield "[DONE]";
                    default:
                        throw new IllegalStateException("Unexpected value: " + event.event());
                };
            } catch (JsonProcessingException e) {
                throw new IllegalArgumentException(String.format("Could not parse event into json format. Raw event value is %s", event.event()), e);
            }
        }
        throw new IllegalArgumentException("Event name is null.");
    }
}
