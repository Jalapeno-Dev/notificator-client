package com.jalapeno.database.cache.di

import android.content.Context
import androidx.room.Room
import com.jalapeno.database.NotificatorDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    @Singleton
    fun providesNotificatorDatabase(
        @ApplicationContext context: Context,
    ): NotificatorDatabase = Room.databaseBuilder(
        context,
        NotificatorDatabase::class.java,
        NotificatorDatabase.DATABASE_NAME,
    ).build()
}