package moe.kurenai.tdlight.model.chat

import com.fasterxml.jackson.annotation.JsonProperty
import moe.kurenai.tdlight.annotation.NoArg

@NoArg
data class ChatPhoto(

    @JsonProperty("small_file_id")
    val smallFileId: String,

    @JsonProperty("small_file_unique_id")
    val smallFileUniqueId: String,

    @JsonProperty("big_file_id")
    val bigFileId: String,

    @JsonProperty("big_file_unique_id")
    val bigFileUniqueId: String,
) {
}