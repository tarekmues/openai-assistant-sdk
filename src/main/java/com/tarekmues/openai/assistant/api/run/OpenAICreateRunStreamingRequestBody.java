package com.tarekmues.openai.assistant.api.run;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class OpenAICreateRunStreamingRequestBody {

    @JsonProperty("assistant_id")
    private String assistantId;

    @JsonProperty("instructions")
    private String instructions;

    //TODO
    //@JsonProperty("tool_choice")
    //private Object toolChoice;

    @JsonProperty("stream")
    private final boolean stream = true;

    public OpenAICreateRunStreamingRequestBody(@NonNull String assistantId, String instructions) {
        this.assistantId = assistantId;
        this.instructions = instructions;
    }
}
