package com.tarekmues.openai.assistant.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class OpenAIApiResponseWrapper<T> {

    @JsonProperty("list")
    private String object;

    @JsonProperty("data")
    private T[] data;

    @JsonProperty("first_id")
    private String firstId;

    @JsonProperty("last_id")
    private String lastId;

    @JsonProperty("has_more")
    private boolean hasMore;

}

