package com.tarekmues.openai.assistant.api.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class OpenAIMessageImageFileContentDeltaWrapper extends OpenAIMessageContentDelta {

    @JsonProperty("index")
    private int index;

}
