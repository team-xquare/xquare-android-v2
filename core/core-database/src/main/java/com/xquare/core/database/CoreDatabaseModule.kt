package com.xquare.core.database

import androidx.room.Room
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.Module
import org.koin.dsl.module

val coreDatabaseModule: Module
    get() = module {
        single<XquareDatabase> {
            Room.databaseBuilder(
                context = androidContext(),
                klass = XquareDatabase::class.java,
                name = "database-xquare",
            ).build()
        }
    }
