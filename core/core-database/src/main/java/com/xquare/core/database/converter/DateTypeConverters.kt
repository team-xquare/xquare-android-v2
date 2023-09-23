package com.xquare.core.database.converter

import androidx.room.TypeConverter
import com.xquare.shared.date.toEpochMillis
import com.xquare.shared.date.toLocalDate
import com.xquare.shared.date.toLocalDateTime
import org.joda.time.LocalDate
import org.joda.time.LocalDateTime

internal class DateTypeConverters {
	@TypeConverter
	fun localDateToLong(value: LocalDate): Long = value.toEpochMillis()

	@TypeConverter
	fun longToLocalDate(value: Long): LocalDate = value.toLocalDate()

	@TypeConverter
	fun localDateTimeToLong(value: LocalDateTime): Long = value.toEpochMillis()

	@TypeConverter
	fun longToLocalDateTime(value: Long): LocalDateTime = value.toLocalDateTime()
}
