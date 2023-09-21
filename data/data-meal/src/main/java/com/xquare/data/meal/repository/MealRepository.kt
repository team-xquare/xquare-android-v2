package com.xquare.data.meal.repository

import com.xquare.core.data.Repository
import com.xquare.data.meal.Meal
import kotlinx.coroutines.flow.Flow
import org.joda.time.LocalDate

abstract class MealRepository : Repository() {
    abstract fun getMealOfDay(date: LocalDate): Flow<Meal>
    abstract fun getMealsOfMonth(date: LocalDate): Flow<List<Meal>>
}
