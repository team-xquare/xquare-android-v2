package com.xquare.core.datastore

import org.koin.android.ext.koin.androidContext
import org.koin.core.module.Module
import org.koin.dsl.module

val coreDataStoreModule: Module
	get() =
		module {
			single<PreferencesDataStore> { androidContext().preferencesDataStore }
		}
