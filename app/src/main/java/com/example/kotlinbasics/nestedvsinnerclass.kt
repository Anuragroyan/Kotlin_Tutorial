package com.example.kotlinbasics
/*
  nested class is such class which is created inside another class.
  in kotlin a nested class is by default static, so its data member and
  member functions can be accessed without creating an object of the class.
  nested classed cannot access the data members of outer classes.
*/
/*
  inner class is a class which is created inside another class with keyword inner.
  or we can say that a nested class which is marked as "inner" is called inner class.
  inner class cannot be declared inside interfaces or non inner nested classes.
  the advantages of inner class over nested class is that,
  it is able to access members of its outer class even it is private.
  the inner class keeps a reference to an object of its outer class.
*/

// nested class example
class OuterClass1{
    private val name: String = "Mr.X"
    class NestedClass{
        val description: String = "code inside nested class"
        private val id: Int = 101
        fun foo(){
     //  println("name is ${name}") cannot access the outer class member
          println("id is ${id}")
        }
    }
}
fun main(args: Array<String>){
    // nested class must be initialized
    println(OuterClass1.NestedClass().description) // accessing property
    var obj = OuterClass1.NestedClass()
    obj.foo() // access member function
    hello(args)
}

// inner class example
open class OuterClass2{
    private val name:String = "Mr.X"
    inner class InnerClass{
        val description: String = "code inside inner class"
        private val id1: Int = 102
        fun foo1(){
            // println("name is ${name}") access the private outer class member
            println("Id1 is ${id1}")
        }
    }
}

fun hello(args: Array<String>){
    println(OuterClass2().InnerClass().description) // accessing property
    var obj = OuterClass2().InnerClass() // object creation
    obj.foo1() // access member function
}