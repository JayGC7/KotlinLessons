package org.example.Lesson1

import java.time.LocalTime
import java.time.format.DateTimeFormatter

fun main(){
    val year: Int = 1963
    var hour:Int = 9
    var minute: Int = 7

    println( "Year of Gagarin's flight: " + year )
    println( "Hour when Gagarin flew: " + hour.toString().padStart(2, '0') )
    println( "Minute of hour when Gagarin flew: " + minute.toString().padStart(2, '0') )

    hour = 10
    minute = 55
    println("Gagarin landed at " + LocalTime.of(hour,minute).format(DateTimeFormatter.ofPattern("HH:mm")))
}