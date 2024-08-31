package lectures.part2oop

object Generics extends App{

  class MyList[A] {  // is a generic class
      //use the type A
  }

  //traits can also be generalized

  class MyMap[Key, Value]

  val listOfIntegers =  new MyList[Int]
  val listOfString =  new MyList[String]

  //generic methods
  object MyList{
    def empty[A]: MyList[A] = ???
  }

  val emptyListOfIntegers = MyList.empty[Int]


  //variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  //does list of cat or dog will also list of Animal ???
  //1. first ans - YES
  //List[Cat] extends List[Animal] = COVARIANCE

  class CovariantList[+A]   //+A denotes covariant list
  val Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]


  //animalList.add(new Dog) ??? HARD QUE
  //2. NO = INVARIANT LIST
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

  //3. opposite relationship = CONTRAVARIANCE
  class ContravariantList[-A]   //-A denotes contravariant list
  val contravariantAnimalList: ContravariantList[Cat] = new ContravariantList[Animal]

  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]


  //bounded type -
  // allows to use to generics classes only for certain types - either a subclass of different types or a superclass of different types


  class Cage[A <: Animal](animal: A)
  //class Cage only accepts type parameter A which are subtypes of Anima`
  val cage = new Cage(new Dog)

}
