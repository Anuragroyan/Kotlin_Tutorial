package com.example.kotlinbasics

import java.lang.ArithmeticException
import java.lang.NullPointerException

/*
 An exception is a runtime problem which occurs in the program and leads to program termination.
 1- running out of memory
 2- array out of bound
 3- condition like divided by zero
 to handle this type of problem during program execution the technique of exception handling is used.
 exception handling is a technique which handles the runtime problems and maintains the flow of program execution.
*/
/*
 throwable class which throws an exception
 there are four different keywords used in exception handling,
 these are-
 try: the try block contains a set of statements which might generate an exception.
      it must be followed by either catch or finally or both.
 catch: the catch block is used to catch the exception thrown from try block.
 finally: finally block always execute whether exception is handled or not. So it is
          used to execute important code statement. (like closing buffers)
 throw: the throw keyword is used to throw an exception explicitly.
*/
/*
 unchecked exception is that exception which is thrown due to mistakes in our code.
 this exception type extends the RuntimeException class.
 the Unchecked exception is checked at run time.
*/
/*
  1- ArithmeticException: thrown when we divide a number by zero.
  2- ArrayIndexOutOfBoundExceptions: thrown when an array has been tried to access
       with incorrect index value.
  3- SecurityException: throws by the security manager to indicate a security violation.
  4- NullPointerException: throws when looking a method or property on a null object.
*/
/*
  A checked exception is checked at compile time.
  this exception type extends the Throwable class.
  example of checked exception-
  1- IOException
  2- SQLException
*/
/*
 we can use multiple catch blocks in our code.
 multiple catch blocks are used when we are using different types of operation
 in a try block which may cause different exceptions in the try block.
*/
/*
 we can also use nested try blocks whenever required.
 the requirement of nested try catch block arises when a block of code
 generated an exception and within that block another code statement also
 generates another exception.
*/
// example without exception handling-
fun getNumber1(str: String): Int{
    return try {
        Integer.parseInt(str)
    }catch (e: ArithmeticException){
        0
    }
}
fun getNumber2(str2: String):Int{
    return try {
        Integer.parseInt(str2)
    }catch (e: ArithmeticException){
        0
    }
}
fun main1(){
    val str = getNumber1("10")
    println(str)
    val str2 = getNumber2("10.5")
    println(str2)
}

fun main2(args:Array<String>){
    try {
        val a =  IntArray(5)
        a[5] = 10/0
    }catch (e: ArithmeticException){
        println("arithmetic exception catch")
    }catch (e: ArrayIndexOutOfBoundsException){
        println("array index outofbounds exception")
    }catch (e: Exception){
        println("parent exception class")
    }
    println("code after try catch..")
}

fun main3(args: Array<String>){
    try {
        val data = 10/5
        println(data)
    }catch (e:NullPointerException){
        println(e)
    }finally {
        println("finally block always executes")
    }
    println("below code..")
}

fun main4(args: Array<String>){
    validate(15)
    println("code after validation check..")
}
fun validate(age:Int){
    if(age<18){
        throw ArithmeticException("under age")
    }else{
        println("eligible for drive")
    }
}
