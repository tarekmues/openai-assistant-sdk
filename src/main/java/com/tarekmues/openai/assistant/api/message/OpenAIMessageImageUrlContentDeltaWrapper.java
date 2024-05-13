package com.tarekmues.openai.assistant.api.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class OpenAIMessageImageUrlContentDeltaWrapper {

    @JsonProperty("index")
    private int index;

    @JsonProperty("image_url")
    private OpenAIMessageImageUrl imageUrl;

    @NoArgsConstructor
    @Getter
    @Setter
    private static class OpenAIMessageImageUrl {

        @JsonProperty("url")
        private String url;

        @JsonProperty("detail")
        private String detail;
    }
}
