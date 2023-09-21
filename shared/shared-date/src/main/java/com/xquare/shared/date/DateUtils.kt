package com.xquare.shared.date

import org.joda.time.DateTime
import org.joda.time.DateTimeZone
import org.joda.time.LocalDateTime

fun LocalDateTime.toEpochMillis(
    zone: DateTimeZone = DateTimeZone.UTC,
): Long = this.toDateTime(zone).millis

fun Long.toLocalDateTime(
    zone: DateTimeZone = DateTimeZone.UTC,
): LocalDateTime = DateTime(this, zone).toLocalDateTime()
