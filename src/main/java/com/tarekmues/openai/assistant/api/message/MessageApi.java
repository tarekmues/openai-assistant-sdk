package com.tarekmues.openai.assistant.api.message;

import com.tarekmues.openai.assistant.model.OpenAIApiResponseWrapper;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Map;

public class MessageApi {

    private final WebClient client;

    public MessageApi(WebClient client) {
        this.client = client;
    }

    public Mono<OpenAIMessage> createMessage(String threadId, OpenAIMessageCreationBody body) {
        return client.post()
                .uri(builder -> builder.path("/threads/{threadId}/messages").build(threadId))
                .body(BodyInserters.fromValue(body))
                .retrieve()
                .bodyToMono(OpenAIMessage.class);
    }

    public Mono<OpenAIApiResponseWrapper<OpenAIMessage>> listMessages(String threadId) {
            return client.get()
                    .uri(builder -> builder.path("/threads/{threadId}/messages").build(threadId))
                    .retrieve()
                    .bodyToMono(new ParameterizedTypeReference<OpenAIApiResponseWrapper<OpenAIMessage>>() {});
    }

    public Mono<OpenAIMessage> retrieveMessage(String threadId, String messageId) {
        return client.get()
                .uri(builder -> builder.path("/threads/{threadId}/messages/{messageId}").build(threadId, messageId))
                .retrieve()
                .bodyToMono(OpenAIMessage.class);
    }

    public Mono<OpenAIMessage> modifyMessage(String threadId, String messageId, Map<String, String> metadata) {
        return client.post()
                .uri(builder -> builder.path("/threads/{threadId}/messages/{messageId}").build(threadId, messageId))
                .body(BodyInserters.fromValue(metadata))
                .retrieve()
                .bodyToMono(OpenAIMessage.class);
    }
}
