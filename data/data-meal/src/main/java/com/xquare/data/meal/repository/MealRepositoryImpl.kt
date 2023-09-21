package com.xquare.data.meal.repository

import com.xquare.data.meal.Meal
import com.xquare.database.meal.datasource.MealDatabaseDataSource
import com.xquare.datastore.meal.datasource.MealDataStoreDataSource
import com.xquare.network.meal.datasource.MealNetworkDataSource
import kotlinx.coroutines.flow.Flow
import org.joda.time.LocalDate

internal class MealRepositoryImpl(
    private val mealDatabaseDataSource: MealDatabaseDataSource,
    private val mealDataStoreDataSource: MealDataStoreDataSource,
    private val mealNetworkDataSource: MealNetworkDataSource,
) : MealRepository() {
    override fun getMealOfDay(date: LocalDate): Flow<Meal> {
        TODO("Not yet implemented")
    }

    override fun getMealsOfMonth(date: LocalDate): Flow<List<Meal>> {
        TODO("Not yet implemented")
    }
}
