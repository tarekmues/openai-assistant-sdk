package com.tarekmues.openai.assistant.api.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tarekmues.openai.assistant.model.OpenAIAssistantTool;
import com.tarekmues.openai.assistant.api.run.step.OpenAIRunStepDetails;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class OpenAIMessageToolCallsWrapper extends OpenAIRunStepDetails {

    @JsonProperty("tool_calls")
    private List<OpenAIAssistantTool> toolCalls;
}
