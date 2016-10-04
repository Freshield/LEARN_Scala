/**
  * Created by FRESHIELD on 2016/10/4.
  */
object chp11 {

  def main(args: Array[String]) {

    println(42 max 43)
    println(42 min 43)
    println(1 until 5)
    println(1 to 5)
    println(3.abs)
    println((-3).abs)

    def isEqueal(x: Int, y: Int) = x == y
    println(isEqueal(421,421))
    def isEqueal1(x: Any, y: Any) = x == y
    println(isEqueal1(421,421))

    val x = "abcd".substring(2)
    println(x)
    val y = "abcd".substring(2)
    println(y)

    println(x == y)

    val x1 = new String("abc")
    val y1 = new String("abc")

    println(x1 == y1)
    println(x1 eq y1)
    println(x1 ne y1)

    val x2: String = null
    println(x2)

    def divide(x: Int, y: Int): Int =
      if (y != 0) x / y
      else sys.error("can't divide by zero")

    println(divide(1,1))
    println(divide(1,0))



  }

}
