package com.xquare.database.meal.service

import com.xquare.core.database.dao.meal.MealDao

internal class MealDatabaseServiceImpl(
	private val mealDao: MealDao,
) : MealDatabaseService()
