package com.xquare.datastore.meal.datasource

import com.xquare.datastore.meal.service.MealDataStoreService

internal class MealDataStoreDataSourceImpl(
	private val mealDataStoreService: MealDataStoreService,
) : MealDataStoreDataSource()
