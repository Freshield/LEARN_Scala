/**
  * Created by FRESHIELD on 2016/11/2.
  */


object chp21 {

  def main(args: Array[String]) {
    //println(stringWrapper("abc123") exists (_.isDigit))

    println("abc123" exists(_.isDigit))

    println("try to do something")

    //println(printWithSpaces(stringWrapper("xyz")))

    println("fix")

    println("test on centos")

    implicit def doubleToInt(x: Double) = x.toInt

    val i: Int = 3.5

    println(i)

    val one = new Rational(1)
    println(one.n)
    println(one + one)

    implicit def intToRational(x: Int) =
      new Rational(x)

    println(1 + one)


  }
/*
  implicit def stringWrapper(s: String) =
    new IndexedSeq[Char] {
      def length = s.length

      def apply(i: Int) = s.charAt(i)
    }
*/
  class Rational(val n: Int) {

    def + (that: Rational): Rational =
      new Rational(n + that.n)

    override def toString = n.toString

  }


  def printWithSpaces(seq: IndexedSeq[Char]) =
    seq mkString("/")

  implicit def intToString(x: Int) = x.toString

}
