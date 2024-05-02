package com.tarekmues.openai.assistant.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum OpenAIMessageStatus {

    @JsonProperty("in_progress")
    InProgress,

    @JsonProperty("incomplete")
    Incomplete,

    @JsonProperty("completed")
    Completed

}
