/**
  * Created by FRESHIELD on 2016/11/2.
  */


object chp21 {

  class PreferredPrompt(val preference: String)
  class PreferredDrink(val preference: String)

  object JoePref{
    implicit val prompt = new PreferredPrompt("Yes, master> ")
    implicit val drink = new PreferredDrink("tea")

  }
  object Greeter{
    def greet(name: String)(implicit prompt: PreferredPrompt, drink: PreferredDrink): Unit ={
      println("welcome, "+name+". the system is ready.")
      print("but while you work, ")
      println("why not enjoy a cup of "+drink.preference+"?")
      println(prompt.preference)
    }
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

  //implicit def intToString(x: Int) = x.toString

  def maxListUpBound[T <: Ordered[T]](elements: List[T]): T =
    elements match {
      case List() =>
        throw new IllegalArgumentException("empty list!")
      case List(x) => x
      case x :: rest =>
        val maxRest = maxListUpBound(rest)
        if (x > maxRest) x
        else maxRest
    }

  def maxListImpParm[T](elements: List[T])
                       (implicit orderer: T => Ordered[T]):T = {
    elements match {
      case List() =>
        throw new IllegalArgumentException("empty list!")
      case List(x) => x
      case x :: rest =>
        val maxRest = maxListImpParm(rest)(orderer)
        if (x > maxRest) x
        else maxRest
    }
  }

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

    val bobsPrompt = new PreferredPrompt("relax> ")
    println(bobsPrompt.preference)


    import JoePref._
    //Greeter.greet("Bob")(bobsPrompt)

    Greeter.greet("Joe")

    println(maxListImpParm(List(1,2,3,4,5)))
    println(maxListImpParm(List(1.5,2.5,3.5)))
    println(maxListImpParm(List("one","two","three")))


  }


}

