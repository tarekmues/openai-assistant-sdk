package com.tarekmues.openai.assistant.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class OpenAIFileCitationWrapper extends OpenAIMessageContentTextAnnotation {

    @JsonProperty("file_citation")
    private OpenAIFileCitation fileCitation;
}
