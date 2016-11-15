/**
  * Created by FRESHIELD on 2016/11/10.
  */
import scala.util.matching.Regex

object chp24 {

  def main(args: Array[String]) {

    val name = "freshield"
    val email = "freshield@gmail.com"

    IsEMail.isEmail(name)
    IsEMail.isEmail(email)

    val email1 = EMail("yy", "ww")
    println(email1.length)
    println(email1.getClass)


    val a = Array(10, 20, "30", "40")
    val b = a.lastOption
    println(b)

    IsTwice.isTwice("123123")
    IsTwice.isTwice("12312")

    IsEMail.userTwiceUpper("DIDI@gmail.com")
    IsEMail.userTwiceUpper("dido@gmail.com")
    IsEMail.userTwiceUpper("DIDO@gmail.com")
    IsEMail.userTwiceUpper("didi@gmail.com")

    println(IsEMail.isTomInDotCom("tom@sun.com"))
    println(IsEMail.isTomInDotCom("peter@sun.com"))
    println(IsEMail.isTomInDotCom("tom@acm.org"))

    val ExpandedEMail(name1, topdom, subdom @ _*) = "tom@support.epfl.ch"

    println(name1)
    println(topdom)
    println(subdom)

    val x = List(1,2,3)
    val test1 = x match {
      case x: Seq[Int] => println("seq");x
      case List() => println("array");List()
      case List(w @ _*) => println("list");w
      case _ => println("other");None

    }

    println(test1)

    println("---------------------------")

    val Decimal1 = """(-)?(\d+)(\.\d*)?""".r
    println(Decimal1)

    val Decimal = new Regex("(-)?(\\d+)(\\.\\d*)?")
    val Decimal2 = "(-)?(\\d+)(\\.\\d*)?".r


    val input1 = "for -1.0 to 99 by 3"
    println(input1)

    println("---------------------------")

    for (s <- Decimal1 findAllIn(input1)){
      println("here")
      println(s)
    }

    println(Decimal1 findFirstIn(input1))


    val Decimal(sign, integerpart, decimalpart) = "-1.23"
    println(sign)
    println(integerpart)
    println(decimalpart)

    val Decimal(sign1, integerpart1, decimalpart1) = "1.0"
    println(sign1)
    println(integerpart1)
    println(decimalpart1)

    for (Decimal(s, i, d) <- Decimal findAllIn input1)
      println("sign: " + s + ", integer: " + i + ", decimal: " + d)



  }


}
