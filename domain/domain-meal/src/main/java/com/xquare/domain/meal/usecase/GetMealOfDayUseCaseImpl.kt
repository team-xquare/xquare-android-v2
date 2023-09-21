package com.xquare.domain.meal.usecase

import com.xquare.data.meal.Meal
import com.xquare.data.meal.repository.MealRepository
import kotlinx.coroutines.flow.Flow
import org.joda.time.LocalDate

internal class GetMealOfDayUseCaseImpl(
    private val mealRepository: MealRepository,
) : GetMealOfDayUseCase() {
    override operator fun invoke(date: LocalDate): Flow<Meal> = mealRepository.getMealOfDay(date)
}
