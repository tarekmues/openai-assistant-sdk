package com.tarekmues.openai.assistant.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class OpenAIFunctionToolCall extends OpenAIToolCall {

    @JsonProperty("name")
    private String name;

    @JsonProperty("arguments")
    private List<String> arguments;

}
