/**
  * Created by FRESHIELD on 2016/11/14.
  */
object ExpandedEMail {
  def unapplySeq(email: String): Option[(String, Seq[String])] = {
    val parts = email split "@"
    if (parts.length == 2) {
      println("expandedemail")
      Some(parts(0), parts(1).split("\\.").reverse)
    }
    else {
      None
    }
  }

}
