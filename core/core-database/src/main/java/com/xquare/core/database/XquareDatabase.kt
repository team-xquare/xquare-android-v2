package com.xquare.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.xquare.core.database.dao.meal.MealDaoAbs
import com.xquare.core.database.entity.MealEntity

@Database(
    entities = [
        MealEntity::class,
    ],
    version = 0,
)
internal abstract class XquareDatabase : RoomDatabase() {
    abstract val mealDao: MealDaoAbs
}
