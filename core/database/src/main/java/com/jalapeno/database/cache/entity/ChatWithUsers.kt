package com.jalapeno.database.cache.entity

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

data class ChatWithUsers(
    @Embedded
    val chatEntity: ChatEntity,

    @Relation(
        parentColumn = "id",
        entityColumn = "id",
        associateBy = Junction(
            UserChatCrossRef::class,
            parentColumn = "chat_id",
            entityColumn = "user_id",
        )
    )
    val users: List<UserEntity>
)
