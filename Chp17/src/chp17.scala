/**
  * Created by FRESHIELD on 2016/10/14.
  */
import scala.collection.mutable.ListBuffer
import scala.collection.mutable.ArrayBuffer
import scala.collection.immutable.Queue
import scala.collection.mutable
import scala.collection.mutable.Stack

object chp17 {

  def main(args: Array[String]) {
    val colors = List("red","blue","green")
    println(colors.head)
    println(colors.tail)
    colors.foreach(println)

    val fiveInts = new Array[Int](5)
    println(fiveInts.mkString(" "))
    val fiveToOne = Array(5,4,3,2,1)
    println(fiveToOne.mkString(" "))

    fiveInts(0) = fiveToOne(4)
    println(fiveInts.mkString(" "))

    val buf = new ListBuffer[Int]
    println(buf)
    println(buf += 1)
    println(buf += 2)
    println(buf)
    println(3 +: buf)
    println(buf.toList)

    val buf1 = new ArrayBuffer[Int]()
    println(buf1)
    println(buf1 += 12)
    println(buf1 += 15)
    println(buf1)
    println(buf1.length)
    println(buf1(0))

    val empty1 = Queue[Int]()
    println(empty1)
    val has1 = empty1.enqueue(1)
    println(has1)
    val has123 = has1.enqueue(List(2,3))
    println(has123)
    val (element, has23) = has123.dequeue
    println(element)
    println(has23)

    val queue = new scala.collection.mutable.Queue[String]
    println(queue)
    println(queue += "a")
    println(queue ++= List("b","c"))
    println(queue)
    println(queue.dequeue)
    println(queue)

    val stack = new Stack[Int]
    println(stack.push(1))
    println(stack.push(2))
    println(stack.pop)
    println(stack.pop())
    println(stack)

    def hasUpperCase(s: String) = s.exists(_.isUpper)
    println(hasUpperCase("Robert Frost"))
    println(hasUpperCase("e e cummings"))


  }

}
