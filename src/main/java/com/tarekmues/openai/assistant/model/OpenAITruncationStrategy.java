package com.tarekmues.openai.assistant.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class OpenAITruncationStrategy {

    @JsonProperty("type")
    private OpenAITruncationStrategyType type;

    public enum OpenAITruncationStrategyType {

        @JsonProperty("auto")
        Auto,

        @JsonProperty("last_messages")
        LastMessages

    }

    @JsonProperty("last_messages")
    private int lastMessages;

}