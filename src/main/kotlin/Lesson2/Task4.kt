package org.example.Lesson2

const val PROCENTS = 100

fun main(){
    val buff = 20.0
    val bonus:Double = buff/PROCENTS
    val crystal = 7
    val silver = 11
    val bonus_crystal = (crystal * bonus).toInt()
    val bonus_silver = (silver * bonus).toInt()
    println("With buff you can get $bonus_crystal more crystal.")
    println("With buff you can get $bonus_silver more silver.")
}