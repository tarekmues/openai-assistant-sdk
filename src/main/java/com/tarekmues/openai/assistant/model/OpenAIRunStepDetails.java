package com.tarekmues.openai.assistant.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = OpenAIMessageCreationDetailsWrapper.class, name = "message_creation"),
        @JsonSubTypes.Type(value = OpenAIMessageToolCallsWrapper.class, name = "tool_calls"),
})
@NoArgsConstructor
@Getter
@Setter
public class OpenAIRunStepDetails {
}
