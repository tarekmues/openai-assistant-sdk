package com.tarekmues.openai.assistant.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class OpenAIResourceUsage {

    @JsonProperty("completion_tokens")
    private int completionTokens;

    @JsonProperty("prompt_tokens")
    private int promptTokens;

    @JsonProperty("total_tokens")
    private int totalTokens;

}
