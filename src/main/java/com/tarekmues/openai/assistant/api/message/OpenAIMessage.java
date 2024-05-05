package com.tarekmues.openai.assistant.api.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tarekmues.openai.assistant.model.OpenAIStreamingEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
public class OpenAIMessage extends OpenAIStreamingEntity {

    @JsonProperty("id")
    private String id;

    @JsonProperty("created_at")
    private Instant createdAt;

    @JsonProperty("thread_id")
    private String threadId;

    @JsonProperty("status")
    private OpenAIMessageStatus status;

    @JsonProperty("incomplete_details")
    private OpenAIMessageIncompleteDetails incompleteDetails;

    @JsonProperty("completed_at")
    private Instant completedAt;

    @JsonProperty("incomplete_at")
    private Instant incompleteAt;

    @JsonProperty("role")
    private OpenAIMessageProducer role;

    @JsonProperty("content")
    private List<OpenAIMessageContent> content;

    @JsonProperty("assistant_id")
    private String assistantId;

    @JsonProperty("run_id")
    private String runId;

    @JsonProperty("attachments")
    private List<OpenAIMessageAttachments> attachments;

    @JsonProperty("metadata")
    private Map<String, String> metadata;

}
