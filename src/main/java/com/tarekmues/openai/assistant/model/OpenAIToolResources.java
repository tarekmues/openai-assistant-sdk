package com.tarekmues.openai.assistant.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class OpenAIToolResources {

    @JsonProperty("code_interpreter")
    private OpenAICodeInterpreterToolResources codeInterpreterToolResources;

    @JsonProperty("file_search")
    private OpenAIFileSearchToolResources fileSearchToolResources;

}
