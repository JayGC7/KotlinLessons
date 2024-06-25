package org.example.Lesson3

fun main(){
    val move_from:String
    val move_to:String
    val move_num:Int

    move_from = "D2"
    move_to = "D3"
    move_num = 1
    val string_to_send = "[$move_from:$move_to;$move_num]"
    println(string_to_send)
}