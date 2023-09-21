package com.xquare.network.meal.datasource

import com.xquare.network.meal.service.MealNetworkService

internal class MealNetworkDataSourceImpl(
    private val mealNetworkService: MealNetworkService,
) : MealNetworkDataSource()
