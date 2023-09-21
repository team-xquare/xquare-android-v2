package com.xquare.database.meal.datasource

import com.xquare.core.database.dao.meal.MealDao

internal class MealDatabaseDataSourceImpl(
    private val mealDao: MealDao,
) : MealDatabaseDataSource()
