package com.tarekmues.openai.assistant.files.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum OpenAIFilePurpose {

    @JsonProperty("assistants")
    Assistants,

    @JsonProperty("assistants_output")
    AssistantsOutput,

    @JsonProperty("batch")
    Batch,

    @JsonProperty("batch_output")
    BatchOutput,

    @JsonProperty("fine-tune")
    FineTune,

    @JsonProperty("fine-tune-results")
    FineTuneResults,

    @JsonProperty("vision")
    Vision

}
