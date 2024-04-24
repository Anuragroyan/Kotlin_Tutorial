package com.example.kotlinbasics
/*
  sometimes it is not possible to cast a variable and it throws an exception,
  this is called an unsafe cast.
  the unsafe cast is performed by the infix operator as.
*/
/*
  a nullable string (String?) cannot be cast to non nullable string (String) this throws an exception.
*/
/*
  as? provides a safe cast operation to safely cast to a type.
  it returns a null if casting is not possible rather than throwing an ClassCastException exception.
*/
fun main(args:Array<String>){
// val obj: Any? = null
// val str: String = obj as String
// val obj: Any = 123
// val str: String = obj as String
// source and target variable needs to be nullable for casting to work.
// val obj1: Any? = "String unsafe cast"
// val str1: String? = obj1 as String?
    val location: Any = "Koltin"
    val safeString: String? = location as? String
    val safeInt: Int? = location as? Int
    println(safeString)
    println(safeInt)
}
