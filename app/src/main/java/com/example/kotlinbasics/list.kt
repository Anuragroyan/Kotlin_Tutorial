package com.example.kotlinbasics
fun main(){
    // display list of string element
    val months = listOf("Jan","feb","Mar")
    println(months)
    // display only months name
    println(months[2])
    val anytypes = listOf(1,2,3,true,false,"Jan","Feb","Mar")
    println(anytypes)
    // display list of element one by one
    for(month in months){
        println(month)
    }
    // if you want to add new element in list we cannot do it because it is immutable
    val additionalMonths = months.toMutableList()
    val newMonths = arrayOf("Apr","May","Jun")
    additionalMonths.addAll(newMonths)
    additionalMonths.add("Jul")
    println(additionalMonths)
    // to create list of days as mutable list
    val days = mutableListOf<String>("Mon","Tue","Wed")
    //  add new element
    days.add("Thu")
    days.add("Fri")
    println(days)
    days[4]="Sun"
    println(days)
    // remove particular element
    days.removeAt(3)
    println(days)
    val removeList = mutableListOf<String>("Mon","Tue")
    // remove all days from the list
    days.removeAll(removeList)
    println(days)
}