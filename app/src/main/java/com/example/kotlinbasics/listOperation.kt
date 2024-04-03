package com.example.kotlinbasics

fun main(){
    val fruitsList = mutableListOf("Apple","Orange","Pineapple","Grapes","Avocados")
    println(fruitsList)
    fruitsList.add(3,"Kiwi")
    println(fruitsList)
    fruitsList.removeAt(5)
    println(fruitsList)
    fruitsList.add(5,"Avocados")
    println(fruitsList)
    var fruits_cnt = fruitsList.count()
    println(fruits_cnt)
    var check_fruits = fruitsList.contains("Avocados")
    if(check_fruits){
        println("Fruits is present in the list")
    }
    else{
        println("Fruits is not present in the list")
    }
    println(check_fruits)
}