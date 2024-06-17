package org.example.Lesson1
import java.time.LocalTime
import java.time.format.DateTimeFormatter

fun main(){
    val sixty = 60
    var sec = 6480
    var min = sec/sixty
    var hour = min/sixty
    val sec_in_space = sec % sixty
    val min_in_space = min % sixty

    println(LocalTime.of(hour,min_in_space,sec_in_space).format(DateTimeFormatter.ofPattern("HH:mm:ss")))



}