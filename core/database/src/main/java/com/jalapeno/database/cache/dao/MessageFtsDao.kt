package com.jalapeno.database.cache.dao

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.jalapeno.database.cache.entity.MessageFtsEntity
import kotlinx.coroutines.flow.Flow

interface MessageFtsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllMessages(messages: List<MessageFtsEntity>)

    @Query("SELECT message_id FROM message_fts WHERE message_fts MATCH :query")
    fun searchAllMessages(query: String): Flow<List<String>>
}