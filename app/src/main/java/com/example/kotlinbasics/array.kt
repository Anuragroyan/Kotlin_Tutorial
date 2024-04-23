package com.example.kotlinbasics

fun main(){
    // declare array in kotlin
    //val number:IntArray = intArrayOf(1,2,3,4,5,6)
    //val number = intArrayOf(1,2,3,4,5,6)
    val numbers = arrayOf(1,2,3,4,5,6)
    println(numbers.contentToString())
    // print array element one by one
    for(element in numbers){
        println(element)
    }
    // print particular element in array
    println(numbers[4])
    println("initial values ${numbers.contentToString()}")
    // update the array values like this -> numbers[3]=8
    numbers[0] = 6
    numbers[1] = 5
    numbers[4] = 2
    numbers[5] = 1
    println("final values ${numbers.contentToString()}")
    // array of string type
    val days = arrayOf("Sun","Mon","Tues","Wed","Thurs","Fri","Sat")
    println(days.contentToString())
    // define separate data class and use it as arrayOf(Fruits("")
    val fruits = arrayOf(Fruit("Apple",2.3),
                         Fruit("Grapes",3.3),
                         Fruit("Mangoes",3.4)
    )
    println(fruits.contentToString())
    // display array as per name
    for(fruit in fruits){
        println(fruit.name)
    }
    // display array as per indices
    for(index in fruits.indices){
        println("${fruits[index].name} is at index $index")
    }
    // display array as mix format
    val mix = arrayOf("Sun","Mon","Tues",1,3,4,Fruit("Apple",2.4))
    println(mix.contentToString())
}

data class Fruit(val name: String, val price: Double)
