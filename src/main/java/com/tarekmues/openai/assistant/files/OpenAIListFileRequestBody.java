package com.tarekmues.openai.assistant.files;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class OpenAIListFileRequestBody {

    @JsonProperty("purpose")
    private String purpose;
}
