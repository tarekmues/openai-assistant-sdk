package com.tarekmues.openai.assistant.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class OpenAIFilePath extends OpenAIMessageContentTextAnnotation {

    @JsonProperty("file_path")
    private OpenAIFilePathContent filePath;

    @NoArgsConstructor
    @Getter
    @Setter
    public static class OpenAIFilePathContent {

        @JsonProperty("file_id")
        private String fileId;

    }

}
