package com.xquare.data.meal

import com.xquare.data.meal.repository.MealRepository
import com.xquare.data.meal.repository.MealRepositoryImpl
import org.koin.core.module.Module
import org.koin.dsl.module

val dataMealModule: Module
    get() = module {
        single<MealRepository> { MealRepositoryImpl(get(), get(), get()) }
    }
