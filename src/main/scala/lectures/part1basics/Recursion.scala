package lectures.part1basics

import scala.annotation.tailrec
import scala.jdk.Accumulator

object Recursion extends App{
    
    //STACK and RECURSION
    def factorial(n:Int) : Int = {
        if (n <= 1) 1
        else {
            println("Computing factorial of " + n + " - I first need factorial of " + (n - 1))
            val result = n * factorial(n - 1)
            println("Computed factorial of " + n)
            
            result
        }
    }
    println(factorial(10))
        
    // RECURSION follows the concept of STACK
    
    
    // in author's case factorial of 5000 failed with the above fn ,
    //    in my case factorial of 10000 failed
    //    println(factorial(10000))
    //    factorial of 10000 - this will StackOverFlow error by calling the upper function
    
    def anotherFactorial(n: Int): BigInt = {
        def factHelper(x: Int, accumulator: BigInt): BigInt =
            if (x <= 1) accumulator
            else factHelper(x - 1, x*accumulator)
        
        factHelper(n, 1)
    }
    
    println(anotherFactorial(10000))
    //now we can get factorial of 10000 with this fn - so what's different in this fn
    
    def factHelper(x: Int, accumulator: BigInt): BigInt =
        if (x <= 1) accumulator
        else factHelper(x - 1, x * accumulator)    // TAIL RECURSION
    
    println(factHelper(20000, 1))
    // we can run this fn independently without making it auxiliary
    
//    why does this factorial fn work and not the other one ?
//    in the later on, we write factHelper (recursive call as the last expression of the code path
//  this allows SCala to preserve the same stack frame and not use additional stack frames for recursive calls

// in the first fn - Scala needed a recursive call stack frame for each recursive call so that is computes intermediate result
    // - multiply it with a number and then pass it back from the stack
    
    
    // TAIL RECURSION - recursive call is the last expression of the code block - uses same stack frame
    // intellij is intelligent enough to identify the TAIL Recursive call - we can also see in the functions - intellij has identified them
    // we can also an annotation to denote it - @tailrec
    
    
    // WHEN U NEED LOOPS - USE TAIL RECURSION
    
    // exercises - do all in tail recursive mode
    //1.concatenate a string n times
    //2. IsPrime fn
    //3. fibonacci fn
    
    def concatenateString(aString : String, times : Int) : String = {
        
        def concatenateHelper(bString:String , bTimes:Int , accumulator:String): String = {
            if(bTimes <= 1) accumulator
            else concatenateHelper(bString,bTimes-1,bString+accumulator)
        }
        concatenateHelper(aString,times,aString)
    }
    println(concatenateString("Hello",5))
    
    def isPrime(n : Int) : Boolean = {
        def aPrimeUntil(t:Int) : Boolean = {
            if(t<=1) true
            else n % t != 0 && aPrimeUntil(t-1)
        }
        aPrimeUntil(n/2)
    }
    
    println("54127 is prime : "+isPrime(54127))
    println("37 is prime : "+isPrime(37))
    
    
    def fibonacciFunction(number: Int) : Int = {
        def fibonacciHelper(t: Int,accumulator: Int) :  Int = {
            
            print(accumulator+" ")
            if(t <=2) accumulator
            else fibonacciHelper(t-1,accumulator)+fibonacciHelper(t-2,accumulator)
            
        }
        fibonacciHelper(number,number)
    }
    println("   ")
    println(fibonacciFunction(9))
}
