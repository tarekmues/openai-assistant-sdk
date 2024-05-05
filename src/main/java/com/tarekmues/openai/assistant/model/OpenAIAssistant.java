package com.tarekmues.openai.assistant.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.List;
import java.util.Map;

@NoArgsConstructor
@Getter
@Setter
public class OpenAIAssistant extends OpenAIStreamingEntity {

    @JsonProperty("id")
    private String id;

    @JsonProperty("created_at")
    private Instant created_at;

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("model")
    private String model;

    @JsonProperty("instructions")
    private String instructions;

    @JsonProperty("tools")
    private List<OpenAIAssistantTool> tools;

    @JsonProperty("tool_resources")
    private OpenAIToolResources toolResources;

    @JsonProperty("metadata")
    private Map<String, String> metadata;

    @JsonProperty("temperature")
    private float temperature;

    @JsonProperty("top_p")
    private float topP;

    //TODO
    //@JsonProperty("response_format")

}