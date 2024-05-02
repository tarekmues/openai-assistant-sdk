package com.tarekmues.openai.assistant.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = OpenAICodeInterpreterTool.class, name = "code_interpreter"),
        @JsonSubTypes.Type(value = OpenAIFileSearchTool.class, name = "file_search"),
        @JsonSubTypes.Type(value = OpenAIFunctionTool.class, name = "function")
})
@NoArgsConstructor
@Getter
@Setter
public abstract class OpenAIAssistantTool {
}
