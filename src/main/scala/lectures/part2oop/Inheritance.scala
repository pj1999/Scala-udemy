package lectures.part2oop

object Inheritance extends App {
    
    class Animal {
        val creatureType = "wild"
        
        def eat = println("nomnom")
        //    private def eat = println("nomnom")  // if we mark this private then cat.eat wont work
        //    private members will be accessible only in this class
        
        protected def eat1 = println(": parent class : nomnom1") // accessible to only sub-class
    }
    
    class Cat extends Animal {
        def crunch = {
            eat1
            println("crunch crunch")
        }
    }
    //SCALA offers Single class Inheritance
    //Subclass only inherits non-private members of superclass
    
    val cat = new Cat
    cat.eat
    cat.crunch
    
    
    //constructors
    class Person(name: String, age: Int) {
        def this(name: String) = this(name, 0)
    }
    
    class Adult(name: String, age: Int, idCard: String) extends Person(name, age)
    
    //overriding
//    class Dog extends Animal {
//        override def eat = println("crunch,crunch")
//
//        override val creatureType: String = "domestic"
//    }
    
//    val dog = new Dog
//    dog.eat
//    println(dog.creatureType)
    
    //can be done like this too
    class Dog1(override val creatureType: String) extends Animal {
        override def eat = {
            super.eat //refer to eat in parent class
            println("child class : crunch,crunch")
        }
    }
    
    //    class Dog(dogType: String) extends Animal {
    //        override def eat = println("crunch, crunch !!")
    //    }
    
    val dog1 = new Dog1("K9")
    dog1.eat
    println(dog1.creatureType)


    //type substitution (broad : polymorphism : the ability of something to have or to be displayed in more than one form)
    val unknownAnimal : Animal = new Dog1("K9")
    unknownAnimal.eat
    
    //overRIDING : diff implementations in derived classes
    //vs
    //overLOADING : supplying multiple methods with "diff signatures" in same class with "same name"
    
    
    //SUPER : is used to refer to parent class method or variable
    
    
    //preventing OVERRIDES :
    // 1. keyword > final on members
    // 2. final keyword on whole class : that class can't be extended
    // 3. seal the class :  extend the class in THIS FILE, prevent extension on other files
}