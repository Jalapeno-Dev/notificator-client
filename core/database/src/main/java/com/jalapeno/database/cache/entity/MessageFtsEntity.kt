package com.jalapeno.database.cache.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Fts4

@Entity(tableName = "message_fts")
@Fts4
data class MessageFtsEntity(
    @ColumnInfo(name = "message_id")
    val messageId: String,

    @ColumnInfo(name = "content")
    val content: String
)
