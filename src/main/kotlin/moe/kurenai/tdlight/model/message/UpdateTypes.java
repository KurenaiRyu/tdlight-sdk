package moe.kurenai.tdlight.model.message;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum UpdateTypes {
    @JsonProperty("message")
    MESSAGE,
    @JsonProperty("channel_post")
    CHANNEL_POST,
    @JsonProperty("callback_query")
    CALLBACK_QUERY
}
