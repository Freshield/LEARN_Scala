/**
  * Created by FRESHIELD on 2016/11/13.
  */
object IsEMail {

  def isEmail(s: String) =
    s match {
      case EMail(user, domain) => println(user +" AT "+ domain)
      case _ => println("not an email address")
    }

}
