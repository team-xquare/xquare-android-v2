package com.xquare.domain.meal.usecase

import com.xquare.core.domain.UseCase
import com.xquare.data.meal.Meal
import com.xquare.data.meal.repository.MealRepository
import kotlinx.coroutines.flow.Flow
import org.joda.time.LocalDate

class GetMealOfMonthUseCase(
    private val mealRepository: MealRepository,
) : UseCase() {
    operator fun invoke(date: LocalDate): Flow<List<Meal>> = mealRepository.getMealsOfMonth(date)
}