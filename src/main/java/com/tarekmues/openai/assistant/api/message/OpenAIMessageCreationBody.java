package com.tarekmues.openai.assistant.api.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class OpenAIMessageCreationBody {

    @JsonProperty("role")
    private OpenAIMessageProducer role;

    @JsonProperty("content")
    private String content;

    @JsonProperty("attachments")
    private List<OpenAIMessageAttachments> attachments;

    @JsonProperty("metadata")
    private Map<String, String> metadata;

    public OpenAIMessageCreationBody(OpenAIMessageProducer role, String content) {
        this.role = role;
        this.content = content;
    }
}
