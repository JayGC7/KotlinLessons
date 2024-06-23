package org.example.Lesson3

fun main(){
    var name = readLine()
    val greetings = listOf("Good morning, $name!", "Good evening, $name!" )

    var out_string = greetings[0]
    println(out_string)
    out_string = greetings[1]
    println(out_string)
}