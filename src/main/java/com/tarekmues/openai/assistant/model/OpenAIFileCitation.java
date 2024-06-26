package com.tarekmues.openai.assistant.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tarekmues.openai.assistant.api.message.OpenAIMessageContentTextAnnotation;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class OpenAIFileCitation extends OpenAIMessageContentTextAnnotation {

    @JsonProperty("file_citation")
    private OpenAIFileCitationContent fileCitation;

}