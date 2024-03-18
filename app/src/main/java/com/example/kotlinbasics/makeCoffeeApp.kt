package com.example.kotlinbasics

data class CoffeeDetails(
    val sugarCount : Int,
    val name : String,
    val size : String,
    val creamAmount : Int
)


fun main(){
    var coffeeForAnurag = CoffeeDetails(12,"Anurag Roy", "xxl",12)
    makeCoffee(coffeeForAnurag)
    var coffeeForKylie = CoffeeDetails(30,"Kylie Rocket", "xxl",50)
    makeCoffee(coffeeForKylie)
}
fun addCoffeeDetails(){
    println("who is this coffee for?")
    val name = readln()
    println("how many pieces of sugar do you want?")
    val sugarCount = 0
    val sugarCountInt = readln().toInt()
}

// define the function
fun makeCoffee(coffeeDetails: CoffeeDetails){
    when (coffeeDetails.sugarCount) {
        1 -> {
            println("Coffee with ${coffeeDetails.sugarCount} spoon of sugar for ${coffeeDetails.name} and creamamount is ${coffeeDetails.creamAmount}")
        }
        0 -> {
            println("Coffee with no sugar for ${coffeeDetails.name} and creamamount is ${coffeeDetails.creamAmount}")
        }
        else -> {
            println("Coffee with ${coffeeDetails.sugarCount} spoons of sugar for ${coffeeDetails.name} and creamamount is ${coffeeDetails.creamAmount}")
        }
    }
}