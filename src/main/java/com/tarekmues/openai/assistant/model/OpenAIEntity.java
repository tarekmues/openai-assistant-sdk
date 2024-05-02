package com.tarekmues.openai.assistant.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "object")
@JsonSubTypes({
        @JsonSubTypes.Type(value = OpenAIAssistant.class, name = "assistant"),
        @JsonSubTypes.Type(value = OpenAIThread.class, name = "thread"),
        @JsonSubTypes.Type(value = OpenAIMessage.class, name = "thread.message"),
        @JsonSubTypes.Type(value = OpenAIRun.class, name = "thread.run"),
        @JsonSubTypes.Type(value = OpenAIMessageDelta.class, name = "thread.message.delta"),
        @JsonSubTypes.Type(value = OpenAIMessageDelta.class, name = "thread.deleted")
})
@NoArgsConstructor
@Getter
@Setter
public class OpenAIEntity {
}
