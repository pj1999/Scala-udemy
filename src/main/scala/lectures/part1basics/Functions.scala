package lectures.part1basics

object Functions extends App {
    
    def aFunction(a: String, b: Int): String = {
        a + " " + b
    }
    
    println(aFunction("hello", 3))
    
    //parameterless fn can be called without paranthesis
    def aParameterLessFunction(): Int = 42
    
    println(aParameterLessFunction())
    //    println(aParameterLessFunction)
    
    def aRepeatedFunction(aString: String, n: Int): String = {
        if (n == 1) aString
        else aString + aRepeatedFunction(aString, n - 1)
    }
    
    println(aRepeatedFunction("hello", 3))
    
    //WHEN YOU NEED LOOPS USE RECURSION
    
    
    //COMPILER can also INFER RETURN TYPES of FUNCTIONS if not specified
    def bFunction(a: String, b: Int) = {
        a + " " + b
    }
    
    println(bFunction("hello", 3))
    
    // But if we will remove the return type from a recursive fn, it will give us the error,
    //RECURSIVE FN has to be given RETURN TYPES
    
    //also we can give UNIT as return types of functions
    def aFunctionWithSideEffects(aString: String): Unit = println(aString)
    // we use UNIT as RETURN TYPE, when we are not computing anything ,like we are printing something on to the console
    aFunctionWithSideEffects("hello")
    
    
    
    // we can also define auxiliary fn inside a functions just as we declare variables
    def aBigFunction(n:Int):Int ={
        def aSmallerFunction(a:Int,b:Int):Int = a+b
        
        aSmallerFunction(n,n-1)
    }
    println(aBigFunction(5))
    
    
    // EXERCISES -
    def aGreetingFunction(name:String,age:String) :String= {
        "HI, my name is $name and my age is $age"
    }
    println(aGreetingFunction("Prakhar","25"))
    
    def aFactorialFunction(number : Int) : Int ={
        if (number ==1) number
        else number*aFactorialFunction(number-1)
    }
    println(aFactorialFunction(9))
    
    def aFibonacciNumberFunction(number:Int) : Int = {
        if (number <= 2) number
        else aFibonacciNumberFunction(number-1)+aFibonacciNumberFunction(number-2)
    }
    println(aFibonacciNumberFunction(8))
    
    def aPrimeNumberFunction(number : Int) : Boolean = {
        def aPrimeUntil(t:Int) : Boolean =
            if (t<=1) true
            else number % t != 0 && aPrimeUntil(t-1)
        aPrimeUntil(number / 2)
    }
    println(aPrimeNumberFunction(5))
}
