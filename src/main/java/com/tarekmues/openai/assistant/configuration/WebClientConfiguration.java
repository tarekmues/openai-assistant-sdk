package com.tarekmues.openai.assistant.configuration;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import io.netty.handler.logging.LogLevel;
import org.springframework.http.client.reactive.ClientHttpConnector;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.http.codec.json.Jackson2JsonEncoder;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.DefaultUriBuilderFactory;
import org.springframework.web.util.UriBuilderFactory;
import reactor.netty.http.client.HttpClient;
import reactor.netty.transport.logging.AdvancedByteBufFormat;

public class WebClientConfiguration {

    private final WebClientConfigurationProperties properties;

    public final WebClient webClient;

    public final ObjectMapper apiMapper;

    public WebClientConfiguration(WebClientConfigurationProperties properties) {
        this.properties = properties;
        apiMapper = openAiApiMapper();
        webClient = openAiAssistantWebClient();
    }

    public WebClient openAiAssistantWebClient() {
        return WebClient
                .builder()
                .uriBuilderFactory(openAiAssistantUriBuilderFactory())
                .exchangeStrategies(webClientExchangeStrategies())
                //.clientConnector(conn)
                .defaultHeader("Authorization", String.format("Bearer %s", this.properties.apiKey))
                .defaultHeader("OpenAI-Beta", "assistants=v2")
                .defaultHeader("OpenAI-Organization", this.properties.organization)
                .defaultHeader("OpenAI-Project", this.properties.project)
                .build();
    }

    private ExchangeStrategies webClientExchangeStrategies() {
        return ExchangeStrategies.builder()
                .codecs(clientCodecConfigurer -> {
                    clientCodecConfigurer.defaultCodecs().jackson2JsonEncoder(new Jackson2JsonEncoder(apiMapper));
                })
                .build();
    }

    private ObjectMapper openAiApiMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.registerModule(new JavaTimeModule());
        return mapper;
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
