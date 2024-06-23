package org.example.Lesson3


fun main(){
    var family_name = "Andreeva"
    var personal_name = "Tatiana"
    var father_name = "Sergeevna"
    var age = 0
    var changes = mutableMapOf(age to "$family_name $personal_name $father_name")

    age = 22
    family_name = "Sidorova"
    changes.put(age, "$family_name $personal_name $father_name")

    val iterator = changes.keys.toList()
    for (i in listOf(20,22)){
        for (j in 0..(iterator.size-1)){
            if (iterator[j]==iterator.last()){
                println(changes[iterator.last()] + ", " + i)
                break
            }else if (iterator[j]<=i && iterator[j+1]> i ){
                println(changes[j]+ ", " + i)
                break
            }
        }
    }
}