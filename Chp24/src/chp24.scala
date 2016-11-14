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

    ExpandedEMail(name, topdom, subdoms @ _*) = "tom@support.epfl.ch"



  }


}
