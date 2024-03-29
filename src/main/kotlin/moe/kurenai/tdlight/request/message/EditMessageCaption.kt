package moe.kurenai.tdlight.request.message

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.core.type.TypeReference
import moe.kurenai.tdlight.client.HttpMethod
import moe.kurenai.tdlight.model.ResponseWrapper
import moe.kurenai.tdlight.model.message.Message
import moe.kurenai.tdlight.model.message.MessageEntity
import moe.kurenai.tdlight.request.Request

data class EditMessageCaption(
    override var caption: String? = null,
) : Request<ResponseWrapper<Message>>(), EditMessageRequest, WithCaption {

    override var chatId: String? = null
    override var messageId: Long? = null
    override var inlineMessageId: String? = null

    override var captionEntities: List<MessageEntity>? = null
    override var parseMode: String? = null

    @JsonIgnore
    override val method = "editMessageCaption"

    @JsonIgnore
    override val responseType = object : TypeReference<ResponseWrapper<Message>>() {}

    @JsonIgnore
    override val httpMethod = HttpMethod.POST

}


