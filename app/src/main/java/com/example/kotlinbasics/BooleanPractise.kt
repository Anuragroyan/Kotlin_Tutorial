package com.example.kotlinbasics

fun main(){
    var myTrue = true
    var myFalse = false
    println(myTrue || myFalse)  // true
    println(myTrue && myFalse)  // false
    println(myTrue && myTrue)   // true
    println(myFalse && myTrue)  // false
    println(!myTrue)  // false
    println(!myFalse) // true
}