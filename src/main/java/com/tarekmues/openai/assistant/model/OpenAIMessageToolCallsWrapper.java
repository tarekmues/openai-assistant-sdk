package com.tarekmues.openai.assistant.model;

import com.fasterxml.jackson.annotation.JsonProperty;
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
