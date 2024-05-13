package com.tarekmues.openai.assistant.api.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.tarekmues.openai.assistant.model.OpenAIMessageContentDeltaAnnotationFileCitation;
import com.tarekmues.openai.assistant.model.OpenAIMessageContentDeltaAnnotationFilePath;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = OpenAIMessageContentDeltaAnnotationFileCitation.class, name = "file_citation"),
        @JsonSubTypes.Type(value = OpenAIMessageContentDeltaAnnotationFilePath.class, name = "file_path")
})
@NoArgsConstructor
@Getter
@Setter
public class OpenAIMessageContentDeltaTextAnnotation {

    @JsonProperty("index")
    private int index;

    @JsonProperty("text")
    private String text;

    @JsonProperty("start_index")
    private int start_index;

    @JsonProperty("end_index")
    private int end_index;

}
