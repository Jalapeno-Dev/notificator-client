package com.jalapeno.database.cache.util

import androidx.room.TypeConverter
import java.time.Instant
import java.time.ZoneId
import java.time.ZonedDateTime

class DateConverter {
    @TypeConverter
    fun fromTimestamp(timestamp: Long): ZonedDateTime {
        return ZonedDateTime.ofInstant(
            Instant.ofEpochMilli(timestamp),
            ZoneId.systemDefault()
        )
    }

    @TypeConverter
    fun dateToTimestamp(dateTime: ZonedDateTime): Long {
        return dateTime.toEpochSecond() * 1000
    }
}