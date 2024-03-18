package com.example.kotlinbasics

class Book (val title : String, val author : String, val yearPublished : Int = 2023){

    init {
      book(title)
      mybook(title,author)
      customeBook(title,author,yearPublished)
    }

    fun book (title: String){
        println("Book named as $title")
    }
    fun mybook(title: String,author: String){
        println("Book named as $title written by $author and published in year $yearPublished")
    }
    fun customeBook(author: String,title: String,yearPublished: Int){
        println("Custom Book named as $title written by $author and published in year $yearPublished")
    }
}