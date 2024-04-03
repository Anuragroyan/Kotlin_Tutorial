package com.example.kotlinbasics

fun main() {
    var number: Int
    println("Please enter a number")
    try {
        // error prone code you want to execute
         number = readln().toInt()
        println("User entered: $number")
    }catch (e : Exception){
        // what should happen when an error occurs
        println("Error ${e.message}")
    }finally {
        number = 0
        println("number is reset to zero each time code executed $number")
    }
}