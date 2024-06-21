package org.example.Lesson2

fun main(){
    val buff = 0.2
    val crystal = 7
    val silver = 11
    val bonus_crystal = (crystal * buff).toInt()
    val bonus_silver = (silver * buff).toInt()
    println("With buff you can get $bonus_crystal more crystal.")
    println("With buff you can get $bonus_silver more silver.")
}