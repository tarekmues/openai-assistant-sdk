package com.tarekmues.openai.assistant.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum OpenAIRunStepType {

    @JsonProperty("message_creation")
    MessageCreation,

    @JsonProperty("tool_calls")
    ToolCalls

}
