package org.example.Lesson2

import java.time.LocalTime
import java.time.format.DateTimeFormatter

const val SEC_IN_MINUTE = 60
fun main() {
    val start_hour: Int = 9
    val start_min: Int = 39
    val road_time: Int = 457

    val start_time = start_hour * SEC_IN_MINUTE + start_min
    val arrive_time = start_time + road_time

    val arrive_hour = arrive_time / SEC_IN_MINUTE
    val arrive_min = arrive_time % SEC_IN_MINUTE

    println("Train arrives at: " + LocalTime.of(arrive_hour, arrive_min).format(DateTimeFormatter.ofPattern("HH:mm")))
}
