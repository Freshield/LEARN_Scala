
/**
  * Created by FRESHIELD on 2016/10/3.
  */
object chp8 {

  def main(args: Array[String]) {
    println("here")
    LongLines.processFile("Chp8.iml",1)

    var increase = (x: Int) => x + 1
    println(increase(10))
    increase = (x: Int) => x + 9999
    println(increase(10))

    increase = (x: Int) => {
      println("we")
      println("are")
      println("here")
      x + 1
    }

    println(increase(10))

    val someNumbers = List(-11, -10, -5, 0, 5, 10)
    someNumbers.foreach((x: Int) => println(x))


    println(someNumbers.filter((x: Int) => x > 0))

    println(someNumbers.filter((x) => x > 0))

    println(someNumbers.filter(x => x > 0))

    println(someNumbers.filter(_ > 0))

    someNumbers.foreach(println(_))

    val f = (_: Int) + (_: Int)

    println(f(5,10))

    someNumbers.foreach(println _)

    def sum(a: Int, b: Int, c: Int) = a + b + c
    println(sum(1,2,3))

    val sumtest = (a: Int, b: Int, c: Int) => a + b + c
    val sumtest1 = (_: Int) +  (_: Int) + (_: Int)
    println(sumtest(1,2,3))
    println(sumtest1(1,2,3))

    val a = sum _
    println(a(1,2,3))

    val b = sum(1, _: Int, 3)
    println(b(2))
    println(b(5))

    val c = sum _
    println(sum(10,20,30))

    var more = 1
    val addMore = (x: Int) => x + more
    println(addMore(10))

    more = 9999
    println(addMore(10))

    var sum1 = 0
    println(someNumbers.foreach(sum1 += _))
    println(sum1)

    def makeInceeaser (more: Int) = (x: Int) => x + more

    val inc1 = makeInceeaser(1)
    val inc9999 = makeInceeaser(9999)

    println(inc1)
    println(inc9999)
    println(inc1(10))
    println(inc9999(10))
    println(makeInceeaser(1)(10))
    println(makeInceeaser(9999)(10))

    def echo(args: String*) =
      args.foreach(println _)

    echo()
    echo("1")
    echo("1","2")



    val arr = Array("what's","up","doc?")
    echo(arr: _*)

    def boom(x: Int): Int =
      if (x == 0) {
        println("boom")
        -1
      }
      else {
        println(x)
        boom(x - 1)
      }

    println(boom(5))

    def isEven(x: Int): Boolean =
      if (x == 0) true else isOdd(x - 1)

    def isOdd(x: Int): Boolean =
      if(x == 0) false else isEven(x - 1)

    println(isEven(2))
    println(isOdd(2))

    def nestedFun(x: Int): Unit = {
      if (x != 0) {
        println(x)
        nestedFun(x - 1)
      }
    }

    nestedFun(10)


  }

}
