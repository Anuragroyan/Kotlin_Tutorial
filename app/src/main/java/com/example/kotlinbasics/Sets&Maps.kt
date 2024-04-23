package com.example.kotlinbasics

fun main(){
    // sets are of immutable state by defaults and it takes only unique values
    val fruits = setOf("Orange","Apple","Mango","Grapes")
    println(fruits)
    // display fruits as alphabetically
    println(fruits.toSortedSet())
    val newFruits = fruits.toMutableSet()
    newFruits.add("water melon")
    newFruits.add("Pear")
    println(newFruits)
    // display fruits at index 3
    println(newFruits.elementAt(3))

    // map are used to store element in the form of key values pairs
    val daysOfTheWeek = mapOf(1 to "Monday",2 to "Tuesday",3 to "Wednesday")
    println(daysOfTheWeek)
    // display map values of particular element
    println(daysOfTheWeek[2])
    // display map values as index
    for(key in daysOfTheWeek.keys){
        println("$key is to ${daysOfTheWeek[key]}")
    }
    val fruitsMap = mapOf("Favorite" to Fruits("Apple",3.5),
                         "Ok" to Fruits("Pineapple",3.4))
    println(fruitsMap)
    // display map values as id
    println(fruitsMap["Favorite"])
    val newDaysOfWeek = daysOfTheWeek.toMutableMap()
    newDaysOfWeek[4] = "Thursday"
    newDaysOfWeek[5] = "Friday"
    // display updated map
    println(newDaysOfWeek)
    // display map in ascending order
    println(newDaysOfWeek.toSortedMap())
    // to replace map element with another element
    println(newDaysOfWeek.replace(4,"Sunday"))
    println(newDaysOfWeek)
}
data class Fruits(val name: String, val price: Double)