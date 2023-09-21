package com.xquare.core.datastore

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.Module
import org.koin.dsl.module

val coreDataStoreModule: Module
    get() = module {
        single<DataStore<Preferences>> { androidContext().preferencesDataStore }
    }
