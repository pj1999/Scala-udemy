package lectures.part2oop

object OOBasics extends App {
    
    val person = new Person("John",25)  // instantiation of object of Person class
    println(person.age)
    println("age - ")
    println(person.x)
    person.greet("Daniel")
    
    
    val author = new Writer("Charles", "Dicken", 1812)
    val imposter = new Writer("Charles", "Dicken", 1812)
    val novel = new Novel("Great Expectations", 1861, author)
    
    println(novel.authorAge)
    println(novel.isWrittenBy(author))
    println(novel.isWrittenBy(imposter))  //returns False - as name and year are same
    
    
    val counter = new Counter
    counter.inc.print
    counter.inc.inc.inc.print
    counter.inc(10).print
    counter.dec(2).print
}

//class parameters are NOT FIELDS
// to convert parameters from FIELDS - is by adding val or var keyword to the class params
class Person(name : String , val age : Int) { //Constructor
    //body
    val x = 2
    println(1+3)
    
    //method
    def greet(name:String) : Unit = println(s"${this.name} says: Hi $name")
    
    //overloading -  function name same - but different definition - within same class
    def greet(): Unit = println(s"Hi, I am $name")
    // def greet = println(s"Hi, I am $name") - can be written like this also
    // as no parameters are there, so paranthesis are not mandatory - and there is only one print statement, so return type is also optional
    
    //multiple constructors
    def this(name:String) = this(name,0)
    def this() = this("John Doe")
    
}
/*
Novel and writer

writer - firstName, surName,year
  - method fullName

Novel - name, yearOfRelease, author
  - method - authorAge
            - isWrittenBy(author
            -copy(new year of release) =  new istance of Novel
 */

/*
Counter class
 - receives an int value
 - method current value
 - method to increament/decreament -> new Couunter
 - overload inc/dec to receive an amount
 */

class Writer(firstName: String, surName: String, val year: Int) {
    def fullName(): Unit = println(s"Full name of the author is : ${this.firstName + " " + this.surName}")
    // or fullName
//          def fullName() : String = firstName + " " + surName
}

class Novel(name: String, year: Int, author: Writer) {
    
    def authorAge = year - author.year
    
    def isWrittenBy(author: Writer) = author == this.author
    
    def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}

class Counter(val count : Int = 0) {
    
    def inc = {         //immutability
        println("incrementing")
        new Counter(count+1)
    }
    def dec = {
        println("decrementing")
        new Counter(count-1)
    }
    def inc(n:Int) : Counter = {  // increment n times  - could easy - new Counter(count+n) : but here it is done thru recursion
        if(n<=0) this
        else inc.inc(n-1)
    }
    def dec(n:Int) :  Counter = {
        if(n<=0) this
        else dec.dec(n-1)
    }
//    def inc(n:Int) = new Counter(count+n)
//    def dec(n:Int) = new Counter(count-n)
    
    def print = println(count)
}