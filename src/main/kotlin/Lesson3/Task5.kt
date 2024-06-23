package org.example.Lesson3

fun main(){
    val in_data = "D2:D4;0"
    var move_from = in_data.substring(0, in_data.indexOf(":"))
    var move_to = in_data.substring(in_data.indexOf(":")+1, in_data.indexOf(";"))
    var move_num = in_data.substring(in_data.indexOf(";")+1, in_data.length)

    println("Move from: $move_from")
    println("Move to: $move_to")
    println("Number of move: $move_num")
}