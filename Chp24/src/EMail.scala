/**
  * Created by FRESHIELD on 2016/11/13.
  */
object EMail {

  def apply(user: String, domain: String) = user + "@" + domain

  def unapply(str: String): Option[(String, String)] = {
    val parts = str split "@"
    if (parts.length == 2) {println("email "+parts(0));Some(parts(0), parts(1))} else None
  }

}
