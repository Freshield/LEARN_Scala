/**
  * Created by FRESHIELD on 2016/11/23.
  */
import org.junit.Test
import org.junit.Assert.assertEquals

object chp29 {

  @Test
  def testNultiAdd: Unit ={
    val set = Set() + 1 + 2 + 3 + 1 + 2 + 3
    assertEquals(3, set.size)
    set.foreach(println)
    println("ok")
  }

  def main(args: Array[String]) {

    testNultiAdd

    val contents = (new Wild).contents
    println(contents.size())

  }

}
