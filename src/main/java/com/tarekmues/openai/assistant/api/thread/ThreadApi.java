package com.tarekmues.openai.assistant.api.thread;

import com.tarekmues.openai.assistant.model.OpenAIThread;
import com.tarekmues.openai.assistant.model.OpenAIThreadCreationBody;
import com.tarekmues.openai.assistant.model.OpenAIThreadDeletionStatus;
import com.tarekmues.openai.assistant.model.OpenAIThreadModificationBody;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class ThreadApi {

    private final WebClient client;

    public ThreadApi(WebClient webClient) {
        this.client = webClient;
    }

    public Mono<OpenAIThread> initThread(OpenAIThreadCreationBody body) {
        return client.post()
                .uri("/threads")
                .body(BodyInserters.fromValue(body))
                .retrieve()
                .bodyToMono(OpenAIThread.class);
    }

    public Mono<OpenAIThread> retrieveThread(String threadId) {
        return client.get()
                .uri(builder -> builder.path("/threads/{threadId}").build(threadId))
                .retrieve()
                .bodyToMono(OpenAIThread.class);
    }

    public Mono<OpenAIThread> modifyThread(String threadId, OpenAIThreadModificationBody body) {
        return client.post()
                .uri(builder -> builder.path("/threads/{threadId}").build(threadId))
                .body(BodyInserters.fromValue(body))
                .retrieve()
                .bodyToMono(OpenAIThread.class);
    }

    public Mono<OpenAIThreadDeletionStatus> deleteThread(String threadId) {
        return client.delete()
                .uri(builder -> builder.path("/threads/{threadId}").build(threadId))
                .retrieve()
                .bodyToMono(OpenAIThreadDeletionStatus.class);
    }
}
