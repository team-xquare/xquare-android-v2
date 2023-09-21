package com.xquare.data.meal.repository

import com.xquare.data.meal.Meal
import kotlinx.coroutines.flow.Flow
import org.joda.time.LocalDate

internal class MealRepositoryImpl(
    private val databaseMealDataSource: DatabaseMealDataSource,
    private val datastoreMealDataSource: DataStoreMealDataSource,
    private val networkMealDataSource: NetworkMealDataSource,
) : MealRepository() {
    override fun getMealOfDay(date: LocalDate): Flow<Meal> {
        TODO("Not yet implemented")
    }

    override fun getMealsOfMonth(date: LocalDate): Flow<List<Meal>> {
        TODO("Not yet implemented")
    }
}
