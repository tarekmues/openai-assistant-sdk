package com.tarekmues.openai.assistant.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tarekmues.openai.assistant.api.run.OpenAIRunRequiredAction;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class OpenAISubmitToolOutputsAction extends OpenAIRunRequiredAction {

    @JsonProperty("tool_calls")
    private List<OpenAIToolCall> toolCalls;
}
