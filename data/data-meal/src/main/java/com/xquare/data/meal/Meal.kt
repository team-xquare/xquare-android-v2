package com.xquare.data.meal

import com.xquare.shared.alias.Dish
import org.joda.time.LocalDate

data class Meal(
    val date: LocalDate,
    val breakfast: List<Dish>,
    val kcalOfBreakfast: List<Dish>,
    val lunch: List<Dish>,
    val kcalOfLunch: List<Dish>,
    val dinner: List<Dish>,
    val kcalOfDinner: List<Dish>,
) : Model
