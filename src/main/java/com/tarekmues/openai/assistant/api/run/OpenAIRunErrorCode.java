package com.tarekmues.openai.assistant.api.run;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum OpenAIRunErrorCode {

    @JsonProperty("server_error")
    ServerError,

    @JsonProperty("rate_limit_exceeded")
    RateLimitExceeded,

    @JsonProperty("invalid_prompt")
    InvalidPrompt

}
