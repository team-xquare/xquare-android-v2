package com.xquare.domain.meal.usecase

import com.xquare.core.domain.UseCase
import com.xquare.data.meal.Meal
import kotlinx.coroutines.flow.Flow
import org.joda.time.LocalDate

abstract class GetMealOfMonthUseCase : UseCase() {
	abstract operator fun invoke(date: LocalDate): Flow<List<Meal>>
}
