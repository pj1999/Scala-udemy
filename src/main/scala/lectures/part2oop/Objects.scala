package lectures.part2oop

object Objects extends App{
    
    //SCALA does not have class-level functionality ("static") -
    // like static members of the class can be called via class name in a static main fn/ or any other static fn
    
    object Person {  //type + its only instance
        // static/class -  level functionality
        val N_EYES = 2
        def canFly : Boolean = false
        
        //factory method : sole purpose is to build Persons with some given parameters
//        def from(mother:Person, father:Person) :  Person = new Person("Bobbie")
        //these factory methods have a name : apply
        def apply(mother:Person, father:Person) :  Person = new Person("Bobbie")
    }
    
    println(Person.canFly)
    println(Person.N_EYES)
    
    class Person(val name:String) {
        //instance-level functionality
    }
    //COMPANIONS -  when with the same name object and class have been defined in the same scope -  can access each others private members
    
    // SCALA objects are SINGLETON INSTANCE -  objects have a single instance only
    val mary = Person
    val john = Person
    println(mary == john)  //true
    
    //here two objects are created of a class Person that's why they are different
    val mary1 = new Person("mary")
    val john1 = new Person("john")
    println(mary1 == john1)  //false
    
//    val bobbie = Person.from(mary1, john1)
//    println(bobbie.name)
    //above statements also work and below also
//    val bobbie = Person.apply(mary1, john1)
    val bobbie = Person(mary1,john1)   // this is widely used practice in scala
    println(bobbie.name)
    
    //Scala Applications = Scala object with
    // def main(args:Array([String]) : Unit
    // if we want scala object to be runnable then this method have to be defined in object or we can simply extend App just like we did here
    
}
