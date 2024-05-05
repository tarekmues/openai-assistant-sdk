package com.tarekmues.openai.assistant.api.run;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.tarekmues.openai.assistant.model.OpenAISubmitToolOutputsAction;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = OpenAISubmitToolOutputsAction.class, name = "submit_tool_outputs")})
@NoArgsConstructor
@Getter
@Setter
public class OpenAIRunRequiredAction {
}
