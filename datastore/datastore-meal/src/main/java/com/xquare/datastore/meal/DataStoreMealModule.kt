package com.xquare.datastore.meal

import com.xquare.datastore.meal.datasource.MealDataStoreDataSource
import com.xquare.datastore.meal.datasource.MealDataStoreDataSourceImpl
import com.xquare.datastore.meal.service.MealDataStoreService
import com.xquare.datastore.meal.service.MealDataStoreServiceImpl
import org.koin.core.module.Module
import org.koin.dsl.module

val dataStoreMealModule: Module
    get() = module {
        single<MealDataStoreDataSource> { MealDataStoreDataSourceImpl(get()) }
        single<MealDataStoreService> { MealDataStoreServiceImpl(get()) }
    }
