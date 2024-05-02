package com.tarekmues.openai.assistant.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum OpenAIRunStatus {

    @JsonProperty("queued")
    Queued,

    @JsonProperty("in_progress")
    InProgress,

    @JsonProperty("requires_action")
    RequiresAction,

    @JsonProperty("cancelling")
    Cancelling,

    @JsonProperty("cancelled")
    Cancelled,

    @JsonProperty("failed")
    Failed,

    @JsonProperty("completed")
    Completed,

    @JsonProperty("expired")
    Expired

}
