package Lectuers.part1Basics

object Functions extends App {
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("suman", 5)) //Function calling with parameters

  def aParameterlessFunction(): Int = 42

  println(aParameterlessFunction())

  def aReapeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aReapeatedFunction(aString, n - 1)
  }

  println(aReapeatedFunction("suman", 5))
  //when you need loops use recursion.
  //it concludes the output returntype is filled but in reccursive function
  //it throws errror .

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aSmallerFunction(a: Int, b: Int): Int = a + b

  aSmallerFunction(9, 9 - 1)

  //1.greeting function (name,age) => "hi my name is $name and i am $age years old"
  //2.Factorial function 1*2*3*4.....*n
  //3.A Fibonacci function
  //f(1)=1
  //f(2)=1
  //f(n) =f(n-1) +f(n-2)
  //4.Tests if a number is prime.

  def greetingForKids(name: String, age: Int): String =
    "hi my name is" + name + "and i am " + age + "years old."

  println(greetingForKids("Suman", 22))

  def factorial(h: Int): Int =
    if (h <= 0) 1
    else h * factorial(h - 1)

  println(factorial(5))


  def isPrime(j: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
    if (t <= 1) true
     else j % t != 0 && isPrimeUntil(t - 1)

     isPrimeUntil(j / 2)
 }
  println(isPrime(37))
  println(isPrime(200))
   println(isPrime(37 * 17))

  def fibonacci(p: Int): Int = {
    if (p <= 2) 1
    else fibonacci(p - 1) + fibonacci(p - 2)
  }//1 1 2 3 5 8 13 21
    println(fibonacci(8))


}


