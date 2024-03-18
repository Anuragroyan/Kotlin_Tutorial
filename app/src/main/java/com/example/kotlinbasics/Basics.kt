package com.example.kotlinbasics

fun main() {
    // creating a object/instance of a class Dog
    // Example 1
    val tommy = Dog("Daisy","Dwarf-poddle",12)
    println("${tommy.name} is a ${tommy.breed} and is ${tommy.age} years old")
    // Example 2
    val book = Book("Do Epic Shit","Ankur Wariku",2012)
    println("${book.title} is written by  ${book.author} and published in year ${book.yearPublished}")
    // Example 3
    val mybook = Book("white tiger","Anurag")
    println("${mybook.title} is written by ${mybook.author} and published in year ${mybook.yearPublished}")
    // Example 4
    val customBook = Book("Human Evolution","Noah",1976)
    println("${customBook.title} is written by ${customBook.author} and published in year ${customBook.yearPublished}")
}