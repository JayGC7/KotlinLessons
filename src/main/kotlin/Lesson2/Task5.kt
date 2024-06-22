package org.example.Lesson2

import kotlin.math.pow

fun main(){
    val start_sum = 70000
    val procents = 16.7
    val years = 20
    val end_sum = start_sum * (1+0.01*procents).pow(years)

    println(String.format("%.3f", end_sum))
}