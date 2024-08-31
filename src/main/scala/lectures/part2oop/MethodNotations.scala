package lectures.part2oop

import scala.language.postfixOps

object MethodNotations extends App{

    class Person(val name:String,favoriteMovie: String, val age : Int = 0){
        def likes(movie :String) :  Boolean = movie == favoriteMovie
        def +(person : Person) : String = s"${this.name} is hanging out with ${person.name}"
        //1st exercise
        def +(nickname : String) : Person = new Person(s"$name, $nickname",favoriteMovie)
        def unary_! :  String = s"$name, what the heck !"
        //2nd exercise
        def unary_+ : Person = new Person(name, favoriteMovie, age+1)
        def isAlive : Boolean = true
        //3rd exercise
        def learns(thing : String) = s"$name is learning $thing"
        def learnsScala  = this learns "Scala"
        def apply() : String = s"Hi my name is $name and i like $favoriteMovie"
        //4th exercise
        def apply(times: Int) : String = s"Mary watched $favoriteMovie $times times"
    }
    
    val mary = new Person("Mary","Inception")
    println(mary.likes("Inception"))
    println(mary likes "Inception") //equivalent
    // this works when the function has only one paramater
    //INFIX NOTATION - operator notation (syntactic sugar) - nicer way to write code - kind of natural langauge - and scala offers that
    
    //OPERATORS in Scala
    val tom = new Person("Tom","Fight Club")
    println(mary + tom)
    println(mary.+(tom))
    
    println(1+2)
    println(1.+(2))
 
    //All OPERATORS are METHODS
    // Akka actors have operators like - ! ?
    
    // PREFIX notation - another form of SYntactic sugar
    val x = -1 //(- is unary operator)   // equivalent to 1.uanry_
    val y = 1.unary_-
    // above both statements are same
    //unary_ prefic only works with ->  + - ~ !
    
    println(!mary)
    println(mary.unary_!)
    
    // POSTFIX Notation
    // fn which don't have a parameter, they have the property of being called in POSTFIX notation
    println(mary.isAlive)
    println(mary isAlive)
 
 
    //apply
    println(mary.apply())
    println(mary())  //equivalent
    //whenever object is called as function, then it actually looks for the definition of apply fn
    
    
    //EXERCISES
    /*1. overload the + operator
    mary + "the rockstar" => new Person "mary (the rockstar)"
    
    2. add an age to the person class
    add a unary ope => new person with the age of+1
    +mary => mary with the age incrementer
    
    3. add a "learns" method in the person class => "Mary learns scala"
    add a learnsScala method, calls learns method with "Scala"
    use it in postfix notation
    
    4. overload the apply method
    mary.apply(2) => "mary watched inception 2 times"*/
    println(mary(2))
    println((mary + "the rockstar")())
    println((mary + "the rockstar").apply())
    println((+mary).age)
    println(mary.learnsScala)
    println(mary learnsScala)
    
    // INFIX   - works with method having one param
    // PREFIX  - works with unary operator - +,-,!,~
    // POSTFIX - works with method having no param
}
