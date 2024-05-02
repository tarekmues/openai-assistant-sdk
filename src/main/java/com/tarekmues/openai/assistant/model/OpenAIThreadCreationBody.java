package com.tarekmues.openai.assistant.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@Builder
public class OpenAIThreadCreationBody {

    @JsonProperty("messages")
    private List<OpenAIMessage> messages;

    @JsonProperty("tool_resources")
    private List<OpenAIToolResources> toolResources;

    @JsonProperty("metadata")
    private Map<String, String> metadata;

}
