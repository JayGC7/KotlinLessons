package org.example.Lesson2

fun main(){
    val students = 4
    val grades = listOf<Int>(3,4,3,5)
    val mid_score:Float = grades.sum().toFloat()/students
    print(mid_score)
}