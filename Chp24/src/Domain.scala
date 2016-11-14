/**
  * Created by FRESHIELD on 2016/11/14.
  */
object Domain {

  def apply(parts: String*): String = {
    parts.reverse.mkString(".")
  }

  def unapplySeq(whole: String): Option[Seq[String]] = {
    println("domain")
    Some(whole.split("\\.").reverse)
  }

}
