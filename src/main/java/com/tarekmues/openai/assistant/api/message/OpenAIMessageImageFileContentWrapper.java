package com.tarekmues.openai.assistant.api.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class OpenAIMessageImageFileContentWrapper extends OpenAIMessageContent {

    @JsonProperty("image_file")
    private OpenAIMessageImageFileContent imageFile;

    @NoArgsConstructor
    @Getter
    @Setter
    public static class OpenAIMessageImageFileContent {

        @JsonProperty("file_id")
        private String fileId;

    }

}