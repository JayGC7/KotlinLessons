package org.example.Lesson3

fun main(){
    val in_data = "D2:D4;0"
    val split_in_data = in_data.split(':',';')

    var move_from = split_in_data[0]
    var move_to = split_in_data[1]
    var move_num = split_in_data[2]

    println("Move from: $move_from")
    println("Move to: $move_to")
    println("Number of move: $move_num")
}