package moe.kurenai.tdlight.request.message

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.core.type.TypeReference
import moe.kurenai.tdlight.client.HttpMethod
import moe.kurenai.tdlight.model.ReplyMarkup
import moe.kurenai.tdlight.model.ResponseWrapper
import moe.kurenai.tdlight.model.media.InputFile
import moe.kurenai.tdlight.model.message.Message
import moe.kurenai.tdlight.model.message.MessageEntity
import moe.kurenai.tdlight.request.MediaRequest
import moe.kurenai.tdlight.request.Request

data class SendVideoNote(
    override val chatId: String,
    val videoNote: InputFile,
) : Request<ResponseWrapper<Message>>(), SendMessageRequest, MediaRequest, Reply, WithCaption, WithReplyMarkup {
    var duration: Long? = null
    var length: Long? = null
    var thumb: InputFile? = null
    var supportsStreaming: Boolean? = null
    override var parseMode: String? = null
    override var replyToMessageId: Long? = null
    override var allowSendingWithoutReply: Boolean? = null
    override var disableNotification: Boolean? = null
    override var sendAt: Long? = null
    override var caption: String? = null
    override var captionEntities: List<MessageEntity>? = null
    override var replyMarkup: ReplyMarkup? = null

    @JsonIgnore
    override val method = "sendVideoNote"

    @JsonIgnore
    override val responseType = object : TypeReference<ResponseWrapper<Message>>() {}

    @JsonIgnore
    override val httpMethod = HttpMethod.POST

}


