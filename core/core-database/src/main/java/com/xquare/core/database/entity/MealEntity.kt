package com.xquare.core.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.xquare.shared.alias.Dish
import org.joda.time.LocalDate

@Entity
internal data class MealEntity(
    @PrimaryKey @ColumnInfo("date") val date: LocalDate,
    @ColumnInfo("breakfast") val breakfast: List<Dish>,
    @ColumnInfo("kcal_breakfast") val kcalOfBreakfast: List<Dish>,
    @ColumnInfo("lunch") val lunch: List<Dish>,
    @ColumnInfo("kcal_lunch") val kcalOfLunch: List<Dish>,
    @ColumnInfo("dinner") val dinner: List<Dish>,
    @ColumnInfo("kcal_dinner") val kcalOfDinner: List<Dish>,
)
