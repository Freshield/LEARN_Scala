/**
  * Created by FRESHIELD on 2016/10/2.
  */
object chp6 {

  def main(args: Array[String]) {
    val oneHalf = new Rational(1,2)
    val twoThirds = new Rational(2,3)
    println(oneHalf add twoThirds)
    println(oneHalf.number)
    println(oneHalf.denom)

    val three = new Rational(3)
    println(three)

    val test = new Rational(66,42)
    println(test)

    println(oneHalf + twoThirds)
    println(oneHalf * twoThirds)
    println(oneHalf.+(twoThirds))

    val x = new Rational(2,3)
    println(x * x)
    println(x * 2)

    implicit def intToRational(x: Int) = new Rational(x)
    
    println(2 * x)
  }

}
