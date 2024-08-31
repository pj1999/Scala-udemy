package lectures.part1basics

object Expressions extends App{

    val x = 1+2         //expression
    println(x)

    println(2 + 3 * 4)
    // + - * / & | ^ << >> >>>

    print(1==x)
    // ==  - tests for equality - relational operators

    println(!(1==x))
    // !- logical negation - binary operator

    var aVariable = 2
    aVariable += 3  //also works with -= *= /=
    println(aVariable)



    // INSTRUCTIONS - DO - print , do that do this, compute this
    //      VS
    // EXPRESSIONS  - gives value

    // IF expression - IF is EXPRESSION in SCALA
    val aCondition = true
    val aConditionedValue = if(aCondition) 5 else 3  // IF EXPRESSION
    println(aConditionedValue)

    println(if(aCondition) 5 else 3)
    println(1+3)


    var i = 0
    while (i < 10){
        println(i)
        i +=1
    }

    // NEVER WRITE THIS AGAIN
    // SCALA FORCES EVERYTHING TO BE IN EXPRESSION

    val aWeirdValue = (aVariable = 3)   // Unit === void
    println(aWeirdValue)
    // Side effects-  Scala - Expressions returning Unit
    // println, whiles, reassigning - thses returns Unit


    // Code Blocks
    val aCodeBlock = {
        val y = 2
        val z = y+1
        if (z>2) "hello" else "goodbye" // what this expression returns, that will be the value of aCodeBlock val
    }
    println(aCodeBlock)


    //1. Difference b/w "hello world" vs println("hello world") ?
    // "hello world" - string literal
    // println("hello world") - expression (side effect - returning unit)
    // both of the returning different things

    //2.
    val someValue = {
        2<3
    } //someValue will contain -true
    println(someValue)

    val someOtherValue = {
        if(someValue) 239 else 986 //becomes irrelevant
        42
    }  //someOtherValue will be 42
    println(someOtherValue)
}
