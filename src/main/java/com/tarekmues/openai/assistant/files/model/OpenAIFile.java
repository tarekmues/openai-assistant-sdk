package com.tarekmues.openai.assistant.files.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class OpenAIFile {


    @JsonProperty("id")
    private String id;

    @JsonProperty("bytes")
    private int bytes;

    @JsonProperty("created_at")
    private int createdAt;

    @JsonProperty("filename")
    private String filename;

    @JsonProperty("purpose")
    private OpenAIFilePurpose purpose;

}