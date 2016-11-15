/**
  * Created by FRESHIELD on 2016/11/10.
  */
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



  }


}
