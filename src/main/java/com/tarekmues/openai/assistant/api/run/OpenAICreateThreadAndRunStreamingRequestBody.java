package com.tarekmues.openai.assistant.api.run;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tarekmues.openai.assistant.model.OpenAIThreadCreationBody;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class OpenAICreateThreadAndRunStreamingRequestBody extends OpenAICreateRunStreamingRequestBody {

    @JsonProperty("thread")
    private OpenAIThreadCreationBody thread;

    public OpenAICreateThreadAndRunStreamingRequestBody(@NonNull String assistantId, @NonNull OpenAIThreadCreationBody thread, String instructions, String additionalInstructions) {
        super(assistantId, instructions, additionalInstructions);
        this.thread = thread;
    }

}
