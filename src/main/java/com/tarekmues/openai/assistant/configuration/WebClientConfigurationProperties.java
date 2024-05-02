package com.tarekmues.openai.assistant.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
public class WebClientConfigurationProperties {

    @Value("${com.tarekmues.openai.assistant.api.key}")
    public String apiKey;

    @Value("${com.tarekmues.openai.assistant.api.organization}")
    public String organization;

    @Value("${com.tarekmues.openai.assistant.api.project}")
    public String project;

}
