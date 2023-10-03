package com.jalapeno.database.cache.di

import com.jalapeno.database.NotificatorDatabase
import com.jalapeno.database.cache.dao.ChatDao
import com.jalapeno.database.cache.dao.MessageDao
import com.jalapeno.database.cache.dao.MessageFtsDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DaosModule {
    @Provides
    fun providesChatDao(
        database: NotificatorDatabase,
    ): ChatDao = database.chatDao

    @Provides
    fun providesMessageDao(
        database: NotificatorDatabase,
    ): MessageDao = database.messageDao

    @Provides
    fun providesMessageFtsDao(
        database: NotificatorDatabase,
    ): MessageFtsDao = database.messageFtsDao
}