/**
  * Created by FRESHIELD on 2016/11/13.
  */
object IsEMail {

  def isEmail(s: String) =
    s match {
      case EMail(user, domain) => println(user +" AT "+ domain)
      case _ => println("not an email address")
    }

  def userTwiceUpper(s: String) = s match {
    case EMail(Twice(x @ UpperCase()), domain) => println("match: " + x + " in domain " + domain)
    case _ => println("no match")
  }

  def isTomInDotCom(s: String): Boolean = s match {
    case EMail("tom", Domain("com", _*)) => true
    case _ => false
  }

}
