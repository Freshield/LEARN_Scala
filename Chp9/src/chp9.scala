import java.io.{File, PrintWriter}

/**
  * Created by FRESHIELD on 2016/10/3.
  */
object chp9 {

  def main(args: Array[String]) {

    println(containNeg(List(1,2,3,4)))
    println(containNeg(List(-1,2,3,4)))

    println(simpleContainNeg(List(-1,2,3,4)))

    def simpleContainNeg(nums: List[Int]) = nums.exists(_ < 0)

    def containsOdd(nums: List[Int]) = nums.exists(_ % 2 == 1)

    def containNeg(nums: List[Int]): Boolean = {
      var exist = false
      for (num <- nums)
        if (num < 0)
          exist = true
      exist
    }

    def plainOldSum(x: Int, y: Int) = x + y
    println(plainOldSum(1,2))

    def curriedSum(x: Int)(y: Int) = x + y
    println(curriedSum(1)(3))

    def first(x: Int) = (y: Int) => x + y
    val second = first(1)
    println(second)
    println(second(2))

    val onePlus = curriedSum(1)_
    println(onePlus)
    println(onePlus(2))

    val twoPlus = curriedSum(2)_
    println(twoPlus)
    println(twoPlus(2))

    def twice(op: Double => Double, x: Double) = op(op(x))
    println(twice(_ + 1, 5))
    println(twice(x => x + 1, 5))

    def withPrintWrite(file: File, op: PrintWriter => Unit): Unit = {
      val writer = new PrintWriter(file)
      try{
        op(writer)
      }finally {
        writer.close()
      }
    }

    withPrintWrite(
      new File("date.txt"),
      writer => {
        writer.println(new java.util.Date)
        println(new java.util.Date)
      }
    )

    def funcWrite(writer: PrintWriter): Unit ={
      writer.println(new java.util.Date)
      println(new java.util.Date)
    }

    withPrintWrite(
      new File("funcDate.txt"),
      funcWrite
    )

    println("hello,world")
    println{"hello,world~"}

    val g = "hello,world"
    println(g.substring(7,9))

    def currWithPrintWriter(file: File)(op: PrintWriter => Unit): Unit ={
      val writer = new PrintWriter(file)
      try{
        op(writer)
      }finally {
        writer.close()
      }
    }

    val file = new File("currDate.txt")
    currWithPrintWriter(file){
      writer => {
        writer.println(new java.util.Date)
        println(new java.util.Date)
      }
    }

    var assertionsEnabled = true
    def myAssert(predicate:  => Boolean) ={
      if (assertionsEnabled && !predicate)
        throw new AssertionError
      //predicate
    }



    println(myAssert(5 > 3))

    def boolAssert(predicate: Boolean) = {
      if (assertionsEnabled && !predicate)
        throw new AssertionError()
      //predicate
    }

    println(boolAssert(5 > 3))

    assertionsEnabled = false

    //boolAssert(10 / 0 == 0)
    myAssert(10 / 0 == 0)






  }


}
