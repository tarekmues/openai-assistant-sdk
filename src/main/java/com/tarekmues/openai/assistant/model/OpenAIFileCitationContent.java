package com.tarekmues.openai.assistant.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class OpenAIFileCitationContent {

    @JsonProperty("file_id")
    private String fileId;

    @JsonProperty("quote")
    private String quote;

}
