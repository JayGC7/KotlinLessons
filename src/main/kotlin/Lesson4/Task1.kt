package org.example.Lesson4

fun main() {
    val tables = 13
    val today_reserved = 13
    val tomorrow_reserved = 9
    var free_to_reserved: Boolean

    if (tables > today_reserved) {
        free_to_reserved = true
    } else {
        free_to_reserved = false
    }
    println("Free to reserved today: $free_to_reserved")

    if (tables > tomorrow_reserved) {
        free_to_reserved = true
    } else {
        free_to_reserved = false
    }
    println("Free to reserved tomorrow: $free_to_reserved")

}