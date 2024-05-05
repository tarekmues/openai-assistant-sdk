package com.tarekmues.openai.assistant.configuration;

import com.tarekmues.openai.assistant.api.message.MessageApi;
import com.tarekmues.openai.assistant.api.run.RunApi;
import com.tarekmues.openai.assistant.api.run.step.RunStepApi;
import com.tarekmues.openai.assistant.api.thread.ThreadApi;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
@EnableConfigurationProperties(WebClientConfigurationProperties.class)
public class ApiConfiguration {

    private final WebClientConfiguration webClientConfiguration;

    public ApiConfiguration(WebClientConfigurationProperties webClientConfigurationProperties) {
        this.webClientConfiguration = new WebClientConfiguration(webClientConfigurationProperties);
    }

    @Bean
    public MessageApi messageApi() {
        return new MessageApi(this.webClientConfiguration.webClient);
    }

    @Bean
    public ThreadApi threadApi() {
        return new ThreadApi(this.webClientConfiguration.webClient);
    }

    @Bean
    public RunApi runApi() {
        return new RunApi(this.webClientConfiguration.webClient, this.webClientConfiguration.apiMapper);
    }

    @Bean
    public RunStepApi runStepApi() {
        return new RunStepApi(this.webClientConfiguration.webClient);
    }
}