package com.xquare.core.database.dao.meal

import com.xquare.core.database.DatabaseDao
import com.xquare.core.database.entity.MealEntity
import kotlinx.coroutines.flow.Flow
import org.joda.time.LocalDate

abstract class MealDao : DatabaseDao<MealEntity>() {
	abstract fun findByDate(date: LocalDate): Flow<MealEntity>

	abstract fun findMonthOfMealsByDate(date: LocalDate): Flow<MealEntity>

	abstract fun deleteByDate(date: LocalDate)
}
