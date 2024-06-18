package org.example.Lesson1
import java.time.LocalTime
import java.time.format.DateTimeFormatter
const val SEC_IN_MINUTE =60
fun main(){
    var sec = 6480
    var min = sec / SEC_IN_MINUTE
    var hour = min / SEC_IN_MINUTE
    val sec_in_space = sec % SEC_IN_MINUTE
    val min_in_space = min % SEC_IN_MINUTE

    println(LocalTime.of(hour,min_in_space,sec_in_space).format(DateTimeFormatter.ofPattern("HH:mm:ss")))



}