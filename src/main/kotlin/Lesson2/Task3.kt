package org.example.Lesson2

import java.time.LocalTime
import java.time.format.DateTimeFormatter

fun main(){
    val start_hour:Int = 9
    val start_min:Int = 39
    val road_time:Int = 457
    val sixty = 60

    val start_time = start_hour*sixty + start_min
    val arrive_time = start_time + road_time

    val arrive_hour = arrive_time/sixty
    val arrive_min = arrive_time%sixty

    println("Train arrives at: " + LocalTime.of(arrive_hour,arrive_min).format(DateTimeFormatter.ofPattern("HH:mm")))

}
