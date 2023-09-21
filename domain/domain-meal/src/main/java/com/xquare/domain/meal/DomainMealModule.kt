package com.xquare.domain.meal

import com.xquare.domain.meal.usecase.GetMealOfDayUseCase
import com.xquare.domain.meal.usecase.GetMealOfDayUseCaseImpl
import com.xquare.domain.meal.usecase.GetMealOfMonthUseCase
import com.xquare.domain.meal.usecase.GetMealOfMonthUseCaseImpl
import org.koin.core.module.Module
import org.koin.dsl.module

val domainMealModule: Module
    get() = module {
        single<GetMealOfDayUseCase> { GetMealOfDayUseCaseImpl(get()) }
        single<GetMealOfMonthUseCase> { GetMealOfMonthUseCaseImpl(get()) }
    }
