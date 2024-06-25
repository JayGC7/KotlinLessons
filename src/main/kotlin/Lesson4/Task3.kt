package org.example.Lesson4

fun main() {
    val sun_condition = true
    val open_tent_condition = true
    val humidity_condition = 20
    val bad_season = "winter"

    var sun_today = true
    var open_tent_today = true
    var humidity_today = 20
    var season_today = "winter"

    val analysis =
        (sun_today == sun_condition) && (open_tent_today == open_tent_condition) && (humidity_today == humidity_condition) && (season_today != bad_season) && (open_tent_today == open_tent_condition)
    println("Are the conditions favorable for the growth of legumes now? $analysis")
}