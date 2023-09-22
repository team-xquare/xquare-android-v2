package com.xquare.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.xquare.core.database.converter.DateTypeConverters
import com.xquare.core.database.converter.ListTypeConverters
import com.xquare.core.database.dao.meal.MealDaoAbs
import com.xquare.core.database.entity.MealEntity

@Database(
    entities = [
        MealEntity::class,
    ],
    version = 0,
)
@TypeConverters(
    DateTypeConverters::class,
    ListTypeConverters::class,
)
internal abstract class XquareDatabase : RoomDatabase() {
    abstract val mealDao: MealDaoAbs
}
