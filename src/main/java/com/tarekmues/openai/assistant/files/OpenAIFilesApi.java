package com.tarekmues.openai.assistant.files;

import com.tarekmues.openai.assistant.files.model.OpenAIFile;
import com.tarekmues.openai.assistant.model.OpenAIApiResponseWrapper;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class OpenAIFilesApi {

    private final WebClient client;

    public OpenAIFilesApi(WebClient client) {
        this.client = client;
    }

    public Mono<OpenAIFile> retrieveFile(String fileId) {
        return client.get()
                .uri(String.format("/files/%s", fileId))
                .retrieve()
                .bodyToMono(OpenAIFile.class);
    }

    public Mono<OpenAIApiResponseWrapper<OpenAIFile>> listFiles() {
        return client.get()
                .uri("/files")
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<OpenAIApiResponseWrapper<OpenAIFile>>() {
                });
    }
}
