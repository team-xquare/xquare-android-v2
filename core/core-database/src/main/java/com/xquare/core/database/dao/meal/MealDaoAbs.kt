package com.xquare.core.database.dao.meal

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.xquare.core.database.entity.MealEntity
import kotlinx.coroutines.flow.Flow
import org.joda.time.LocalDate

@Dao
internal abstract class MealDaoAbs : MealDao() {
	@Query(
		"""
            SELECT * FROM tbl_meal;
        """,
	)
	abstract override fun findAll(): Flow<List<MealEntity>>

	@Upsert
	abstract override fun upsert(entity: MealEntity)

	@Delete
	abstract override fun delete(entity: MealEntity)

	@Query(
		"""
            DELETE FROM tbl_meal;
        """,
	)
	abstract override fun deleteAll()

	@Query(
		"""
            SELECT * FROM tbl_meal
            WHERE date = :date;
        """,
	)
	abstract override fun findByDate(date: LocalDate): Flow<MealEntity>

	@Query(
		"""
            SELECT * FROM tbl_meal
            WHERE strftime('%m', date) IS strftime('%m', :date);  
        """,
	)
	abstract override fun findMonthOfMealsByDate(date: LocalDate): Flow<MealEntity>

	@Query(
		"""
            DELETE FROM tbl_meal
            WHERE date = :date;
        """,
	)
	abstract override fun deleteByDate(date: LocalDate)
}
