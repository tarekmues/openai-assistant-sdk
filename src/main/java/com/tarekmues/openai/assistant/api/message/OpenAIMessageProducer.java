package com.tarekmues.openai.assistant.api.message;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum OpenAIMessageProducer {

    @JsonProperty("user")
    User,

    @JsonProperty("assistant")
    Assistant

}