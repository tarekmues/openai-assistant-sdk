package com.tarekmues.openai.assistant.api.message;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = OpenAIMessageImageFileContentDeltaWrapper.class, name = "image_file"),
        @JsonSubTypes.Type(value = OpenAIMessageTextContentDeltaWrapper.class, name = "text")
})
@NoArgsConstructor
@Getter
@Setter
public class OpenAIMessageContentDelta {
}
