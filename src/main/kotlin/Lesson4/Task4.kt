package org.example.Lesson4

fun main() {
    var group = mutableListOf("arms/abs", "legs/back")
    val first_day = "arms/abs"
    val odd_days = 1
    val even_days = 0

    if (group.indexOf(first_day) != odd_days) {
        group[even_days] = group[odd_days]
        group[odd_days] = first_day
    }

    var today = 5
    var today_training = ""
    if (today % 2 == odd_days) {
        today_training = group[odd_days]
    } else {
        today_training = group[even_days]
    }

    println(
        "Training arms today?\t" + today_training.contains("arms") +
        "\nTraining legs today?\t" + today_training.contains("legs") +
        "\nTraining abs today? \t" + today_training.contains("abs") +
        "\nTraining back today?\t" + today_training.contains("back")
    )

    today = 6
    today_training = ""
    if (today % 2 == odd_days) {
        today_training = group[odd_days]
    } else {
        today_training = group[even_days]
    }

    println(
        "Training arms today?\t" + today_training.contains("arms") +
        "\nTraining legs today?\t" + today_training.contains("legs") +
        "\nTraining abs today? \t" + today_training.contains("abs") +
        "\nTraining back today?\t" + today_training.contains("back")
    )

}