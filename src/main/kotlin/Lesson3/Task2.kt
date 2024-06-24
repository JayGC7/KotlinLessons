package org.example.Lesson3


fun main(){
    var family_name = "Andreeva"
    var personal_name = "Tatiana"
    var father_name = "Sergeevna"
    var age = 20
    var changes = mutableListOf("$family_name $personal_name $father_name, $age")

    age = 22
    family_name = "Sidorova"
    changes.addLast("$family_name $personal_name $father_name, $age")

    println(changes[0])
    println(changes[1])
}