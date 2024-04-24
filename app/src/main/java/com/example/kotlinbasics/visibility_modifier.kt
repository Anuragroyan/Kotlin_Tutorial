package com.example.kotlinbasics
/* visibility modifier are the keywords which are used to restrict the use of classes,
   interfaces, methods and properties in kotlin.
*/
// these modifiers are used at multiple places such as class header or method body.
/* visibility modifier are categorized into four different types-
   public, private, protected, internal
*/
/*
  public modifier element is accessible from everywhere in the project, it is a default modifier in kotlin, If any class interface etc are specified with any access/visibility modifier then that class, interface etc is used in public scope.
  all public declarations can be placed at the top of the file.
  if a member of a class is not specified then it is by default public.
*/
/*
   private modifier allows the element to be accessible only within the block in which properties, fields etc are declared.
   the private modifier declaration does not allow access outside the scope.
   a private package can be accessible within that specific file.
*/
/*
  the internal modifier is feature in kotlin, which is not available in java.
  the internal modifier makes the field visible only inside the module in which it is implemented.
  all the fields are declared as internal which are accessible only inside the module in which they are implemented.
*/
/*
   in kotlin all classes are final by default, so they can't be inherited by default.
   in java it's the opposite, there you have to make your class final explicitly
   so to make a class inheritable to other classes you must mark it with the open keyword
   else you get an error "type is final so can't be inherited"
*/
/*
   a protected modifier with a class or an interface allows visibility to its class or subclass only.
   a protected declaration (when overridden) in its subclass is also protected unless it is explicitly changed.
   the protected modifier cannot be declared at a top level.(for package)
*/
open class Base(){
    var a=1 // public by default
    private val b=2 // private to base class
    internal val d=4 // visible inside the same module
    protected fun e(){
        // visible to the base and the derived class
    }
}
class Derived: Base(){
    // a,c,d and e() of the base class are visible
    // b is not visible
     val c=9 // c is protected so override is not possible
}
fun main(args: Array<String>){
    val base = Base()
    // base.a and base.d are visible
    // base.b base.c and base.e() are not visible
    val derived = Derived()
    // derived c is not visible
}