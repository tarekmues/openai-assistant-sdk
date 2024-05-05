package com.tarekmues.openai.assistant.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tarekmues.openai.assistant.api.message.OpenAIMessageCreationBody;
import lombok.*;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@Builder
public class OpenAIThreadCreationBody {

    @JsonProperty("messages")
    private List<OpenAIMessageCreationBody> messages;

    @JsonProperty("tool_resources")
    private List<OpenAIToolResources> toolResources;

    @JsonProperty("metadata")
    private Map<String, String> metadata;

}
