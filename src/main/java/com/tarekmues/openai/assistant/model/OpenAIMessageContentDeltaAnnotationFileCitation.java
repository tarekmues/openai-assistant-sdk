package com.tarekmues.openai.assistant.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tarekmues.openai.assistant.api.message.OpenAIMessageContentDeltaTextAnnotation;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class OpenAIMessageContentDeltaAnnotationFileCitation extends OpenAIMessageContentDeltaTextAnnotation {

    @JsonProperty("index")
    private int index;;

    @JsonProperty("file_citation")
    private OpenAIFileCitationContent fileCitation;

}
