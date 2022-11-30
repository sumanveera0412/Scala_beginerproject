package Lectuers.part1Basics

import java.util.concurrent.locks.Condition

object Expressions extends App {
  val x= 1+2 //expression
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>>> (right shift with zero extension)

  println(1==x)
  // == != <= >= < >

  var aVariable =2
  aVariable +=3 // also works with -= *= /=

  // Instructions(Do) vs Expressions (Value)
  //If expression

  val aCondition = false
  val aConditionedValue = if (aCondition) 5 else 3 //if else expression
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)
  println(1+3)

//  var i=0
//  while(i<10){
//    println(i)
//    i+=1

    //Never write this type of if expression not a standard one.
    // evrything in scala is an Expression
    val aWieredValue = (aVariable=3)//unit == void
    println(aWieredValue)

    //side effects : println (),whiles , reassigning

    //Code Blocks

    val aCodeBlock = {
      val y=2
      val z=y+1
      if (z>2) "hello" else "goodbye"
    }
    // we can not allocate the element present inside the aCodeBlock .

    val SomeValue = {
      2 < 3
    }
    println(SomeValue) //here it print the boolean value because it has expression in code block
    val someOtherValue = {
      if (SomeValue) 239 else 989
      42
    }
    println(someOtherValue)//here it prints only 42 because SomeValue codeblock value cannot be taken intio another .


}
