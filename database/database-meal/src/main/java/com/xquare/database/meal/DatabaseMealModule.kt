package com.xquare.database.meal

import com.xquare.database.meal.datasource.MealDatabaseDataSource
import com.xquare.database.meal.datasource.MealDatabaseDataSourceImpl
import com.xquare.database.meal.service.MealDatabaseService
import com.xquare.database.meal.service.MealDatabaseServiceImpl
import org.koin.core.module.Module
import org.koin.dsl.module

val databaseMealModule: Module
	get() =
		module {
			single<MealDatabaseDataSource> { MealDatabaseDataSourceImpl(get()) }
			single<MealDatabaseService> { MealDatabaseServiceImpl(get()) }
		}
