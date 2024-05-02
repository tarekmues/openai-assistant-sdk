package com.tarekmues.openai.assistant.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class OpenAIThreadDeletionStatus extends OpenAIEntity {

    @JsonProperty("id")
    private String id;

    @JsonProperty("deleted")
    private boolean deleted;

}
