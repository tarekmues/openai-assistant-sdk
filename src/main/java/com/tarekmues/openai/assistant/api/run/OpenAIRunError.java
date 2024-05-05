package com.tarekmues.openai.assistant.api.run;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class OpenAIRunError {

    @JsonProperty("code")
    private OpenAIRunErrorCode code;

    @JsonProperty("message")
    private String message;

}
