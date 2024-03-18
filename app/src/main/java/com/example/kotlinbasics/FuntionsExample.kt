package com.example.kotlinbasics

// call the function
fun main(){
    println("Enter the number 1")
    val num1Str = readln()
//    val num1 = num1Str.toInt()
    val num1D = num1Str.toDouble()
    println("Enter the number 2")
    val num2Str = readln()
//    val num2 = num2Str.toInt()
    val num2D = num1Str.toDouble()
//    val myresult = add(num1,num2)
    val myresult = divide(num1D,num2D)
    println("The result is $myresult")
}

fun add(num1:Int,num2:Int):Int{
    val result = num1+num2
    return  result
}

fun divide(num1:Double,num2:Double):Double{
    val result = num1/num2
    return result
}

