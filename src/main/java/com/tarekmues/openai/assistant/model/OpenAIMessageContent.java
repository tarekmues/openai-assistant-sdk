package com.tarekmues.openai.assistant.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = OpenAIMessageImageFileContentWrapper.class, name = "image_file"),
        @JsonSubTypes.Type(value = OpenAIMessageTextContentWrapper.class, name = "text")
})
@NoArgsConstructor
@Getter
@Setter
public abstract class OpenAIMessageContent {
}
