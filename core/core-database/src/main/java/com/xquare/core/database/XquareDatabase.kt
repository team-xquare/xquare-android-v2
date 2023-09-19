package com.xquare.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.xquare.core.database.dao.MealDao
import com.xquare.core.database.entity.MealEntity

@Database(
    entities = [
        MealEntity::class,
    ],
    version = 0,
)
abstract class XquareDatabase : RoomDatabase() {
    abstract val mealDao: MealDao
}
