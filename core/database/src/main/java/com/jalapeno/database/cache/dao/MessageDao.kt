package com.jalapeno.database.cache.dao

import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.jalapeno.database.cache.entity.MessageEntity
import kotlinx.coroutines.flow.Flow

interface MessageDao {
    @Upsert
    suspend fun upsertMessage(message: MessageEntity)

    @Delete
    suspend fun deleteMessage(message: MessageEntity)

    @Query("SELECT * FROM message")
    fun getAllMessages(): Flow<List<MessageEntity>>
}