package com.xquare.core.database.converter

import androidx.room.TypeConverter
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

internal class ListTypeConverters {
	@TypeConverter
	fun stringListToString(value: List<String>): String = Json.encodeToString(value)

	@TypeConverter
	fun stringToStringList(value: String): List<String> = Json.decodeFromString(value)
}
