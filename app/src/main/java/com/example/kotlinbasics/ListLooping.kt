package com.example.kotlinbasics

fun main(){
    val numbers = mutableListOf(1,2,3,4,5,6)
    println(numbers)
    for (index in 0 until  6){
        numbers[index] = index*2
        println("numbers are ${numbers[index]} and its index $index")
    }
}