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



  }


}
