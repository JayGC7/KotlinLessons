package org.example.Lesson4

fun main() {
    val average_weight_min = 35
    val average_weight_max = 100
    val average_volume = 100

    var package_weight = 20
    var package_volume = 80

    println(
        "Package with $package_weight weight and $package_volume volume corresponds to average: " +
                (average_weight_min < package_weight && average_weight_max >= package_weight && average_volume > package_volume)
    )

    package_weight = 50
    package_volume = 100
    println(
        "Package with $package_weight weight and $package_volume volume corresponds to average: " +
                (average_weight_min < package_weight && average_weight_max >= package_weight && average_volume > package_volume)
    )
}
