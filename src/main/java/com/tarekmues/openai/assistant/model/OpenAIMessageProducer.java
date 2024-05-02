package com.tarekmues.openai.assistant.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum OpenAIMessageProducer {

    @JsonProperty("user")
    User,

    @JsonProperty("assistant")
    Assistant

}