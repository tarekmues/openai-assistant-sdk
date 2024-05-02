package com.tarekmues.openai.assistant.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class OpenAIFilePathWrapper extends OpenAIMessageContentTextAnnotation {

    @JsonProperty("file_path")
    private OpenAIFilePath filePath;

}
