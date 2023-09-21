package com.xquare.network.meal

import com.xquare.network.meal.datasource.MealNetworkDataSource
import com.xquare.network.meal.datasource.MealNetworkDataSourceImpl
import com.xquare.network.meal.service.MealNetworkService
import com.xquare.network.meal.service.MealNetworkServiceImpl
import org.koin.core.module.Module
import org.koin.dsl.module

val networkMealModule: Module
    get() = module {
        single<MealNetworkDataSource> { MealNetworkDataSourceImpl(get()) }
        single<MealNetworkService> { MealNetworkServiceImpl(get()) }
    }
