package moe.kurenai.tdlight.model.message;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.OptionalLong;

public record MessageId(
        @JsonProperty("message_id") OptionalLong messageId
) {
}
