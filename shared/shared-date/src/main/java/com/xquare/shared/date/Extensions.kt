package com.xquare.shared.date

import org.joda.time.DateTime
import org.joda.time.DateTimeZone
import org.joda.time.LocalDate
import org.joda.time.LocalDateTime

fun LocalDateTime.toEpochMillis(zone: DateTimeZone = DateTimeZone.UTC): Long =
	this.toDateTime(zone).millis

fun Long.toLocalDateTime(zone: DateTimeZone = DateTimeZone.UTC): LocalDateTime =
	DateTime(this, zone).toLocalDateTime()

fun LocalDate.toEpochMillis(zone: DateTimeZone = DateTimeZone.UTC): Long =
	DateTime(
		this.year,
		this.monthOfYear,
		this.dayOfMonth,
		0,
		0,
		0,
		zone,
	).millis

fun Long.toLocalDate(zone: DateTimeZone = DateTimeZone.UTC): LocalDate =
	LocalDate(this * 1000, zone)
