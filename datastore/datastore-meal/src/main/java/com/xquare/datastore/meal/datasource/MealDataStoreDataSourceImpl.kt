package com.xquare.datastore.meal.datasource

import com.xquare.core.datastore.PreferencesDataStore

internal class MealDataStoreDataSourceImpl(
    private val dataStore: PreferencesDataStore,
) : MealDataStoreDataSource()
