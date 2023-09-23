package com.xquare.database.meal.datasource

import com.xquare.database.meal.service.MealDatabaseService

internal class MealDatabaseDataSourceImpl(
	private val mealDatabaseService: MealDatabaseService,
) : MealDatabaseDataSource()
