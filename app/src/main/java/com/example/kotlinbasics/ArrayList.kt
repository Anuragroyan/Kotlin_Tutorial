package com.example.kotlinbasics
// Basics of ArrayList
// ArrayLists are used to create a dynamic array. Which means the size of an ArrayList can be increase or decrease according your requirement.
// the ArrayList class provides bot read and write functionality.
// the ArrayList follows the sequence of insertion order.
// an ArrayList is non synchronized and it may contain duplicate element.
// Constructor of ArrayList
// ArrayList<E>():Is used to create an empty arraylist.
// ArrayList(Capacity:Int): Is used to create an arraylist of specified capacity.
// ArrayList(element: Collection<E>): Is used to create an arraylist filled with the elements of a collection.
// function of ArrayList
// open fun add(element:E):Boolean -> used to add the specific element into the collection
// open fun clear() -> used to remove all elements from the collection
// open fun get(index: Int):E -> used to return the element at specific index in the list
// open fun remove(element: E):Boolean -> used to remove a single instance of the specific element from current collection,if it is available
fun main() {
    // empty arraylist
    val arrayList = ArrayList<String>()
    arrayList.add("One")
    arrayList.add("Two")
    println(arrayList)
    for(i in arrayList){
        println(i)
    }
    // arraylist using collections
    val arrayList1: ArrayList<String> = ArrayList<String>(5)
    val list: MutableList<String> = mutableListOf<String>()
    list.add("One")
    list.add("Two")
    arrayList1.addAll(list)
    println(arrayList1)
    // filled elements in arraylist using collections
    val itr = arrayList1.iterator()
    while(itr.hasNext()){
        println(itr.next())
    }
    println("size of arraylist = "+arrayList1.size)
    // display arraylist at particular element
    println(arrayList1[1])
    exercise()
}

// write a program that adds five Numbers (Double) to an arrayList and then calculates the average of those numbers.
fun exercise(){
    val MyArrayList: ArrayList<Double> = ArrayList()
    MyArrayList.add(13.212312)
    MyArrayList.add(23.151232)
    MyArrayList.add(32.651553)
    MyArrayList.add(16.223817)
    MyArrayList.add(18.523999)
    var total = 0.0
    for(i in MyArrayList){
        total += i
    }
    val average = total / MyArrayList.size
    println("Average is $average")
}