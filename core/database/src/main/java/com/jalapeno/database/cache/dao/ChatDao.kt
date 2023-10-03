package com.jalapeno.database.cache.dao

import androidx.room.Delete
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Upsert
import com.jalapeno.database.cache.entity.ChatEntity
import com.jalapeno.database.cache.entity.ChatWithMessages
import kotlinx.coroutines.flow.Flow

interface ChatDao {
    @Upsert
    suspend fun upsertChat(chat: ChatEntity)

    @Delete
    suspend fun deleteChat(chat: ChatEntity)

    @Transaction
    @Query("SELECT * FROM chat")
    fun getAllChatsWithMessages(): Flow<List<ChatWithMessages>>
}