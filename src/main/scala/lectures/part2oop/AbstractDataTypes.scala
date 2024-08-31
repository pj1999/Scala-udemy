package lectures.part2oop

//Abstract classes and Traits


object AbstractDataTypes extends App {
    
    //Abstract class -  combination of unimplemented/blank and implemented methods/variables
    // cant be instantiated
    abstract class Animal {
        val creatureType: String
        def eat: Unit
    }
    //    val animal = new Animal  : cant be done
    
    class Dog extends Animal {
        //while overriding methods/variables: override keyword is used but here it is optional in the case of extending Abstract class
        // it understands automatically
        val creatureType: String = "canine"
        def eat: Unit = println("crunch crunch")
    }
    
    //traits - combination of unimplemented/blank and implemented methods/variables
    //same as abstract classes
    //unlike abstract classes, they can be inherited along classes
    trait Carnivore {
        def eat(animal: Animal): Unit
    }
    
    //scala support single class inheritance but multiple traits can be extended in a class
    class Crocodile extends Animal with Carnivore {
        val creatureType: String = "croc"
        def eat: Unit = println("nomnomnom")
        def eat(animal: Animal): Unit = println(s"i am croc and i am eating ${animal.creatureType}")
    }
    
    val dog = new Dog
    val croc = new Crocodile
    croc.eat(dog)
}
