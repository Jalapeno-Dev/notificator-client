package com.jalapeno.database.cache.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.ZonedDateTime

@Entity(tableName = "chat")
data class ChatEntity(
    @PrimaryKey (autoGenerate = true)
    val id: Long = 0,

    @ColumnInfo(name = "created_at")
    val createdAt: ZonedDateTime,

    @ColumnInfo(name = "updated_at")
    val updatedAt: ZonedDateTime,

    @ColumnInfo(name = "deleted_at")
    val deletedAt: ZonedDateTime?,

    @ColumnInfo(name = "owner_id")
    val ownerId: Long,

    @ColumnInfo(name = "title")
    val title: String
)
