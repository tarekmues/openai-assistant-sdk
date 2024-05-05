package com.tarekmues.openai.assistant.api.run.step;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum OpenAIRunStepStatus {

    @JsonProperty("in_progress")
    InProgress,

    @JsonProperty("cancelled")
    Cancelled,

    @JsonProperty("failed")
    Failed,

    @JsonProperty("completed")
    Completed,

    @JsonProperty("expired")
    Expired

}
