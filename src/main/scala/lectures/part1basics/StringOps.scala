package lectures.part1basics

object StringOps extends App{
    
    val str: String = "Hello i am learning Scala"
    
    // string operations
    println(str.charAt(2))
    println(str.substring(7,11))
    println(str.split(" ").toList)
    println(str.startsWith("Hello"))
    println(str.replace(" ","-"))
    println(str.toLowerCase())
    println(str.toUpperCase())
    println(str.length)
    

    val aNumberString = "2"
    val anumber = aNumberString.toInt
    println('a' +: aNumberString :+ 'z')
    println(str.reverse)
    println(str.take(2))
    
    //scala specific: String implementation
    // S-interpolators
    val name =  "David"
    val age = 12
    val greeting = s"Hello, my name is $name and I am $age years old"
    val greeting1 = s"Hello, my name is $name and I am turning ${age+1} years old"
    println(greeting)
    println(greeting1)
    
    //F - interpolators
    val speed = 1.2
    val myth = f"$name can eat $speed%2.2f burgers per minute"
    println(myth)
    
    // RAW - interpolators
    println(raw"this is the \n newline")
    // in raw string, escape sequence dont work, they are as it dealt with, like \n is not read as newline just \n printed in the console
    
    val escaped = "this is the \n newline"
    println(escaped)
    
}
