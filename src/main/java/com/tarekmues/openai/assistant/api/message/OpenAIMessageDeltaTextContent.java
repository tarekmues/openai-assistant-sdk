package com.tarekmues.openai.assistant.api.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class OpenAIMessageDeltaTextContent {

    @JsonProperty("value")
    private String value;

    @JsonProperty("annotations")
    private List<OpenAIMessageContentDeltaTextAnnotation> annotations;

}
