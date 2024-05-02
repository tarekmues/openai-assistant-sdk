package com.tarekmues.openai.assistant.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class OpenAIMessageAttachments {

    @JsonProperty("file_id")
    private String fileId;

    @JsonProperty("tools")
    private List<OpenAIMessageToolDefinition> tools;

    @NoArgsConstructor
    @Getter
    @Setter
    public static class OpenAIMessageToolDefinition {

        @JsonProperty("type")
        private OpenAIMessageToolType type;

        public enum OpenAIMessageToolType {

            @JsonProperty("file_search")
            FileSearch,

            @JsonProperty("code_interpreter")
            CodeInterpreter

        }
    }
}
