package moe.kurenai.tdlight.model.keyboard

import com.fasterxml.jackson.annotation.JsonProperty
import moe.kurenai.tdlight.model.message.LoginUrl

data class InlineKeyboardButton(

    @JsonProperty("text")
    val text: String,

    @JsonProperty("url")
    val url: String? = null,

    @JsonProperty("login_url")
    val loginUrl: LoginUrl? = null,

    @JsonProperty("callback_data")
    val callbackData: String? = null,

    @JsonProperty("switch_inline_query")
    val switchInlineQuery: String? = null,

    @JsonProperty("switch_inline_query_current_chat")
    val switchInlineQueryCurrentChat: String? = null,

    @JsonProperty("pay")
    val pay: Boolean? = null,
) {
}