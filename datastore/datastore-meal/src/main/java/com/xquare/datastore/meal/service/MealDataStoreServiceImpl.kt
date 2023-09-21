package com.xquare.datastore.meal.service

import com.xquare.core.datastore.PreferencesDataStore

internal class MealDataStoreServiceImpl(
    private val dataStore: PreferencesDataStore,
) : MealDataStoreService()
