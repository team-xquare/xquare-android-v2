package com.xquare.core.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.xquare.core.database.entity.MealEntity
import org.joda.time.LocalDate

@Dao
abstract class MealDao {

    @Query(
        """
            SELECT * FROM tbl_meal;
        """,
    )
    abstract fun findAll(): MealEntity

    @Query(
        """
            SELECT * FROM tbl_meal
            WHERE date = :date;
        """,
    )
    abstract fun findByDate(date: LocalDate): MealEntity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun upsert(vararg meals: MealEntity)

    @Delete
    abstract fun delete(meal: MealEntity)

    @Query(
        """
            DELETE FROM tbl_meal
            WHERE date = :date;
        """,
    )
    abstract fun deleteByDate(date: LocalDate)
}
