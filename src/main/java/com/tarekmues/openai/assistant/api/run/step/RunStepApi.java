package com.tarekmues.openai.assistant.api.run.step;

import org.springframework.web.reactive.function.client.WebClient;

public class RunStepApi {

    private final WebClient webClient;

    public RunStepApi(WebClient webClient) {
        this.webClient = webClient;
    }
}
