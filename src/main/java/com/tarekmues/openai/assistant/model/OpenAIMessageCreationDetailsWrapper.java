package com.tarekmues.openai.assistant.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class OpenAIMessageCreationDetailsWrapper extends OpenAIRunStepDetails {

    @JsonProperty("message_creation")
    private OpenAIMessageCreationDetails messageCreation;

    @NoArgsConstructor
    @Getter
    @Setter
    public static class OpenAIMessageCreationDetails {

        @JsonProperty("message_id")
        private String messageId;

    }
}
