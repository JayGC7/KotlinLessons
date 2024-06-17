package org.example.Lesson2

fun main(){
    //Переменные объявила через var т.к. когда-нибудь эти данные могут изменяться
    var workers:Int = 50
    var workers_pay:Int = 30000
    var students:Int = 30
    var students_pay:Int = 20000

    val full_workers_pay:Int = workers * workers_pay
    val full_students_pay:Int = students * students_pay
    val total_money:Int = full_workers_pay + full_students_pay
    val average_pay:Int = total_money/(workers + students)

    println("You need $full_workers_pay money to pay constant workers.")
    println("You need $total_money money to pay constant workers and students.")
    println("Average salary in your company: $average_pay.")

}