package com.tarekmues.openai.assistant.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tarekmues.openai.assistant.api.MessageApi;
import com.tarekmues.openai.assistant.api.RunApi;
import com.tarekmues.openai.assistant.api.ThreadApi;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@AutoConfiguration
public class ApiConfiguration {

    @Bean
    public MessageApi messageApi(@Qualifier("open-ai-assistant-client") WebClient webClient) {
        return new MessageApi(webClient);
    }

    @Bean
    public ThreadApi threadApi(@Qualifier("open-ai-assistant-client") WebClient webClient) {
        return new ThreadApi(webClient);
    }

    @Bean
    public RunApi runApi(@Qualifier("open-ai-assistant-client") WebClient webClient, ObjectMapper mapper) {
        return new RunApi(webClient, mapper);
    }

    public ObjectMapper mapper() {
        return new ObjectMapper();
    }
}
