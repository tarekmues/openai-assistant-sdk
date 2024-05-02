package com.tarekmues.openai.assistant.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.List;

@Getter
public class OpenAIStreamingRunCreationBody {

    @Builder
    public OpenAIStreamingRunCreationBody(@NonNull String assistantId, List<OpenAIMessageCreationBody> additionalMessages, String runInstructions, List<OpenAIAssistantTool> toolChoice) {
        this.assistantId = assistantId;
        this.additionalMessages = additionalMessages;
        this.runInstructions = runInstructions;
        this.toolChoice = toolChoice;
    }

    @JsonProperty("assistant_id")
    @NonNull
    @Setter
    private String assistantId;

    @JsonProperty("additional_messages")
    @Setter
    private List<OpenAIMessageCreationBody> additionalMessages;

    @JsonProperty("additional_messages")
    @Setter
    private String runInstructions;

    @JsonProperty("stream")
    private boolean stream = true;

    @JsonProperty("tool_choice")
    @Setter
    private List<OpenAIAssistantTool> toolChoice;
}
