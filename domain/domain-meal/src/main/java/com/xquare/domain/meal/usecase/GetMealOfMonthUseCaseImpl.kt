package com.xquare.domain.meal.usecase

import com.xquare.data.meal.Meal
import com.xquare.data.meal.repository.MealRepository
import kotlinx.coroutines.flow.Flow
import org.joda.time.LocalDate

internal class GetMealOfMonthUseCaseImpl(
    private val mealRepository: MealRepository,
) : GetMealOfMonthUseCase() {
    override operator fun invoke(date: LocalDate): Flow<List<Meal>> =
        mealRepository.getMealsOfMonth(date)
}
