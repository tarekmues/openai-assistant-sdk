package com.tarekmues.openai.assistant.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.Map;

@NoArgsConstructor
@Getter
@Setter
public class OpenAIThread extends OpenAIStreamingEntity {

    @JsonProperty("id")
    private String id;

    @JsonProperty("created_at")
    private Instant createdAt;

    @JsonProperty("tool_resources")
    private OpenAIToolResources toolResources;

    @JsonProperty("metadata")
    private Map<String, String> metadata;

}
