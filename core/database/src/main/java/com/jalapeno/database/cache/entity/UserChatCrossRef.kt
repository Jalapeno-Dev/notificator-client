package com.jalapeno.database.cache.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import java.time.ZonedDateTime

@Entity(
    tableName = "user_chat",
    primaryKeys = ["user_id", "chat_id"],
    foreignKeys = [
        ForeignKey(
            entity = UserEntity::class,
            childColumns = ["user_id"],
            parentColumns = ["id"],
            onDelete = ForeignKey.CASCADE,
            onUpdate = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = ChatEntity::class,
            childColumns = ["chat_id"],
            parentColumns = ["id"],
            onDelete = ForeignKey.CASCADE,
            onUpdate = ForeignKey.CASCADE
        )
    ]
)
data class UserChatCrossRef(
    @ColumnInfo(name = "user_id")
    val userId: Long,

    @ColumnInfo(name = "chat_id")
    val chatId: Long,

    @ColumnInfo(name = "created_at")
    val createdAt: ZonedDateTime,

    @ColumnInfo(name = "deleted_at")
    val deletedAt: ZonedDateTime?
)
