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
public class OpenAIRun {

    @JsonProperty("id")
    private String id;

    @JsonProperty("object")
    private String object;

    @JsonProperty("created_at")
    private Instant createdAt;

    @JsonProperty("thread_id")
    private String threadId;

    @JsonProperty("assistant_id")
    private String assistantId;

    @JsonProperty("status")
    private OpenAIRunStatus status;

    @JsonProperty("required_action")
    private OpenAIRunRequiredAction requiredAction;

    @JsonProperty("last_error")
    private OpenAIRunError lastError;

    @JsonProperty("expires_at")
    private Instant expiresAt;

    @JsonProperty("started_at")
    private Instant startedAt;

    @JsonProperty("cancelled_at")
    private Instant cancelledAt;

    @JsonProperty("failed_at")
    private Instant failedAt;

    @JsonProperty("completed_at")
    private Instant completedAt;

    @JsonProperty("incomplete_details")
    private OpenAIMessageIncompleteDetails incompleteDetails;

    @JsonProperty("model")
    private String model;

    @JsonProperty("instructions")
    private String instructions;

    @JsonProperty("tools")
    private List<OpenAIAssistantTool> tools;

    @JsonProperty("metadata")
    private Map<String, String> metadata;

    @JsonProperty("usage")
    private OpenAIRunUsage usage;

    @JsonProperty("temperature")
    private float temperature;

    @JsonProperty("top_p")
    private float topP;

    @JsonProperty("max_prompt_tokens")
    private int maxPromptTokens;

    @JsonProperty("max_completion_tokens")
    private int maxCompletionTokens;

    @JsonProperty("truncation_strategy")
    private OpenAITruncationStrategy truncationStrategy;

    @JsonProperty("tool_choice")
    private OpenAIToolChoice toolChoice;

    //TODO
    //@JsonProperty("response_format")

}
