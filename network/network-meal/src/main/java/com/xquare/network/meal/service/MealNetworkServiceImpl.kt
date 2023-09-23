package com.xquare.network.meal.service

import io.ktor.client.HttpClient

internal class MealNetworkServiceImpl(
	private val httpClient: HttpClient,
) : MealNetworkService()
