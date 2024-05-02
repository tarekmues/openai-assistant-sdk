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
public class OpenAIRunStep extends OpenAIEntity {

    @JsonProperty("id")
    private String id;

    @JsonProperty("created_at")
    private Instant createdAt;

    @JsonProperty("thread_id")
    private String threadId;

    @JsonProperty("run_id")
    private String runId;

    @JsonProperty("type")
    private OpenAIRunStepType type;

    @JsonProperty("status")
    private OpenAIRunStepStatus status;

    @JsonProperty("step_details")
    private OpenAIRunStepDetails details;

    @JsonProperty("last_error")
    private OpenAIRunError lastError;

    @JsonProperty("expired_at")
    private Instant expiredAt;

    @JsonProperty("cancelled_at")
    private Instant cancelledAt;

    @JsonProperty("failed_at")
    private Instant failedAt;

    @JsonProperty("completed_at")
    private Instant completedAt;

    @JsonProperty("metadata")
    private Map<String, String> metadata;

    @JsonProperty("usage")
    private OpenAIResourceUsage usage;
}
