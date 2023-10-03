package com.jalapeno.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.jalapeno.database.cache.dao.ChatDao
import com.jalapeno.database.cache.dao.MessageDao
import com.jalapeno.database.cache.dao.MessageFtsDao
import com.jalapeno.database.cache.entity.ChatEntity
import com.jalapeno.database.cache.entity.MessageEntity
import com.jalapeno.database.cache.entity.MessageFtsEntity
import com.jalapeno.database.cache.entity.UserChatCrossRef
import com.jalapeno.database.cache.entity.UserEntity
import com.jalapeno.database.cache.util.DateConverter

@Database(
    entities = [
        ChatEntity::class,
        MessageEntity::class,
        MessageFtsEntity::class,
        UserEntity::class,
        UserChatCrossRef::class
    ],
    version = 1,
    exportSchema = true
)
@TypeConverters(
    DateConverter::class
)
abstract class NotificatorDatabase : RoomDatabase() {

    abstract val chatDao: ChatDao
    abstract val messageDao: MessageDao
    abstract val messageFtsDao: MessageFtsDao

    companion object {
        const val DATABASE_NAME = "notificator_db"
    }
}