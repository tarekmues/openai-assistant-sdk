package com.tarekmues.openai.assistant.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class OpenAIMessageDelta {

    @JsonProperty("id")
    private String id;

    @JsonProperty("object")
    private String object;

    @JsonProperty("delta")
    private OpenAIMessageDeltaDelta delta;

    @NoArgsConstructor
    @Getter
    @Setter
    public static class OpenAIMessageDeltaDelta {

        @JsonProperty("role")
        private OpenAIMessageProducer role;

        @JsonProperty("content")
        private List<OpenAIMessageContent> content;

    }
}
