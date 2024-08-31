package lectures.part1basics

object ValuesVariablesTypes extends App{
  // extends App - makes the object runnable

    val x:Int = 42
    println(x)

//    x = 2 - can re-assign
//    VALS are IMMUTABLE

    val x1 = 40
    println(x1)
    //compiler can INFER types

    val aString:String = "hello";
    println(aString)

    val aBoolean:Boolean = false
    val bBoolean:Boolean = true
    val aChar:Char = 'a'
    val anInt:Int = x
    val aShort:Short = 4613
    val aLong:Long = 463716373687L
    val aFloat:Float = 26278.4136
    val aDouble:Double = 3.14
    //consistent with the Java types

//    VARIABLES - VAR - MUTABLE
    var aVariable:Int = 3
    println(aVariable)

    aVariable = 5         //side effects - can be re-=assigned
    println(aVariable)

    // we have to prefer VAL over VAR
}
