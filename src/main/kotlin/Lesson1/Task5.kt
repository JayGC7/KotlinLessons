package org.example.Lesson1
import java.time.LocalTime
import java.time.format.DateTimeFormatter

fun main(){
    var sec = 6480
    var min = sec/60
    var hour = min/60
    val sec_in_space = sec % 60
    val min_in_space = min % 60

    println(LocalTime.of(hour,min_in_space,sec_in_space).format(DateTimeFormatter.ofPattern("HH:mm:ss")))



}