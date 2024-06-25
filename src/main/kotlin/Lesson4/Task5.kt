package org.example.Lesson4

import java.security.KeyStore.TrustedCertificateEntry

fun main() {
    val members_min = 55
    val members_max = 70
    val food_min = 50
    val weather_condition: Boolean

    var in_string = readln()
    val in_data = in_string.split(' ')

    val curr_damage = in_data[0].toBoolean()
    val curr_members = in_data[1].toInt()
    val curr_food = in_data[2].toInt()
    val curr_weather = in_data[3].toBoolean()

    var permition = false
    if (curr_damage) {
        permition = (curr_members == members_max) && (curr_weather == true) && (curr_food >= food_min)
    } else {
        permition = (curr_members >= members_min) && (curr_members <= members_max) && (curr_food > food_min)
    }
    println("Permition to the ship trip is $permition")
}