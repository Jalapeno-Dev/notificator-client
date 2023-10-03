package com.jalapeno.database.cache.entity

import androidx.room.Embedded
import androidx.room.Relation

data class ChatWithMessages(
    @Embedded
    val chatEntity: ChatEntity,

    @Relation(
        parentColumn = "id",
        entityColumn = "chat_id"
    )
    val messages: List<MessageEntity?>
)
