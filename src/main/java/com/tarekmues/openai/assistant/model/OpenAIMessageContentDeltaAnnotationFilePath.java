package com.tarekmues.openai.assistant.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tarekmues.openai.assistant.api.message.OpenAIMessageContentDeltaTextAnnotation;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class OpenAIMessageContentDeltaAnnotationFilePath extends OpenAIMessageContentDeltaTextAnnotation {

    @JsonProperty("file_path")
    private OpenAIFilePathContent filePath;

}
