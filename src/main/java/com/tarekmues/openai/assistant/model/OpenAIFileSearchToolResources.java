package com.tarekmues.openai.assistant.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class OpenAIFileSearchToolResources extends OpenAIToolResources {

    @JsonProperty("vector_store_ids")
    private List<String> vectorStoreIds;

}
