package com.tarekmues.openai.assistant.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tarekmues.openai.assistant.api.message.OpenAIMessageContentTextAnnotation;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class OpenAIMessageContentFilePath extends OpenAIMessageContentTextAnnotation {

    @JsonProperty("file_path")
    private OpenAIFilePathContent filePath;

}
