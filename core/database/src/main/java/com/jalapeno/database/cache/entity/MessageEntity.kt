package com.jalapeno.database.cache.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.ZonedDateTime

@Entity(tableName = "message")
data class MessageEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,

    @ColumnInfo(name = "created_at")
    val createdAt: ZonedDateTime,

    @ColumnInfo(name = "updated_at")
    val updatedAt: ZonedDateTime,

    @ColumnInfo(name = "deleted_at")
    val deletedAt: ZonedDateTime?,

    @ColumnInfo(name = "author_id")
    val authorId: Long,

    @ColumnInfo(name = "chat_id")
    val chatId: Long,

    @ColumnInfo(name = "content")
    val content: String,
)
