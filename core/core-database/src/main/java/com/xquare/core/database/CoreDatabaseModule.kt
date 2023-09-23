package com.xquare.core.database

import androidx.room.Room
import com.xquare.core.database.dao.meal.MealDao
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.Module
import org.koin.dsl.module

val coreDatabaseModule: Module
	get() =
		module {
			includes(daoModule)
			single<XquareDatabase> {
				Room.databaseBuilder(
					context = androidContext(),
					klass = XquareDatabase::class.java,
					name = "database-xquare",
				).build()
			}
		}

private val daoModule: Module
	inline get() =
		module {
			single<MealDao> { get<XquareDatabase>().mealDao }
		}
