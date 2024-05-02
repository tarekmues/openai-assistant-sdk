package com.tarekmues.openai.assistant.configuration;

import io.netty.handler.logging.LogLevel;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.reactive.ClientHttpConnector;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.DefaultUriBuilderFactory;
import org.springframework.web.util.UriBuilderFactory;
import reactor.netty.http.client.HttpClient;
import reactor.netty.transport.logging.AdvancedByteBufFormat;

@EnableConfigurationProperties(WebClientConfigurationProperties.class)
public class WebClientConfiguration {

    private final WebClientConfigurationProperties properties;

    public WebClientConfiguration(WebClientConfigurationProperties properties) {
        this.properties = properties;
    }

    @Bean("open-ai-assistant-client")
    public WebClient openAiAssistantWebClient() {
        return WebClient
                .builder()
                .uriBuilderFactory(openAiAssistantUriBuilderFactory())
                //.clientConnector(conn)
                .defaultHeader("Authorization", String.format("Bearer %s", this.properties.apiKey))
                .defaultHeader("OpenAI-Beta", "assistants=v2")
                .defaultHeader("OpenAI-Organization", this.properties.organization)
                .defaultHeader("OpenAI-Project", this.properties.project)
                .build();
    }

    HttpClient httpClient = HttpClient.create()
            .wiretap(this.getClass().getCanonicalName(), LogLevel.INFO, AdvancedByteBufFormat.TEXTUAL);

    ClientHttpConnector conn = new ReactorClientHttpConnector(httpClient);

    private UriBuilderFactory openAiAssistantUriBuilderFactory() {
        DefaultUriBuilderFactory factory = new DefaultUriBuilderFactory("https://api.openai.com/v1/");
        factory.setEncodingMode(DefaultUriBuilderFactory.EncodingMode.NONE);
        return factory;
    }

}
