package lectures.part2oop

import com.sun.org.apache.bcel.internal.generic.FALOAD

import java.lang.annotation.ElementType

abstract class MyList {

  /*
  head = first element
  tail = remainder of list
  isEmpty = is this list empty
  add(int) - new list with this new element
  toString = a string representation of this list
   */

  def head: Int
  def tail: MyList
  def isEmpty: Boolean
  def add(element: Int): MyList
  def printElements: String

  //polymorphic call
  override def toString: String = "[" + printElements + "]"
}

object Empty extends MyList{  //object can extend class
  def head: Int = throw new NoSuchElementException()

  def tail: MyList = throw new NoSuchElementException()

  def isEmpty: Boolean = true

  def add(element: Int): MyList = Cons(element, Empty)

  def printElements: String = ""
  // = ??? -not implemented
}

class Cons(h:Int, t: MyList) extends MyList{
  def head: Int = h

  def tail: MyList = t

  def isEmpty: Boolean = false

  def add(element: Int): MyList = Cons(element, this)

  def printElements: String =
    if(t.isEmpty) "" + h
    else s"$h ${t.printElements}"
}

object ListTest extends App{
  val list = new Cons(1, new Cons(2, new Cons(3, new Cons(4, new Cons(5,Empty)))))
  println(list.head)
  println(list.tail.head)
  println(list.add(6).head)
  println(list.isEmpty)


  println(list.toString)

}