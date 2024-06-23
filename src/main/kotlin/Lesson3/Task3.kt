package org.example.Lesson3

fun main(){
    val number: Int = readLine()!!.toInt()
    var out_string: String = ""
    var result = 0
    for (i in 1..10){
        result = number * i
        out_string += "$number x $i = $result\n"
    }
    println(out_string)
}