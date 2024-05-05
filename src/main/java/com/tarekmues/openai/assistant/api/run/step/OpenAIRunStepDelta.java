package com.tarekmues.openai.assistant.api.run.step;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tarekmues.openai.assistant.model.OpenAIStreamingEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class OpenAIRunStepDelta extends OpenAIStreamingEntity {

    @JsonProperty("id")
    private String id;

    @JsonProperty("delta")
    private OpenAIRunStepDeltaDelta delta;

    @NoArgsConstructor
    @Getter
    @Setter
    public static class OpenAIRunStepDeltaDelta {

        @JsonProperty("step_details")
        private OpenAIRunStepDetails stepDetails;

    }

}
