package com.example.kotlinbasics
// lambda expression is a function has no name.
// lambda expression and anonymous functions are function literals but function that are not declared but passed immediately as an expression.
// lambda is defined with curly braces {} which takes variables as a parameter (if any) and a body of a function.
// the body of a function is written after the variable (if any) followed by -> operator.
// syntax = { variable -> body of lambda }

fun main(){
    addNumber(5,10)
    // we will write the same example using a lambda expression
    val sum: (Int,Int) -> Int = {a: Int, b: Int -> a+b}
    println(sum(10,5))
    // shorter format lambda expression
    val sums = {a: Int, b: Int -> println(a+b)}
    println(sums(11,2))
}

fun addNumber(a: Int, b: Int){
    val add = a+b
    println(add)
}

// trigger a lambda expression
//   button.setOnclickListener{
//       sum.invoke(5,10)
//   }
