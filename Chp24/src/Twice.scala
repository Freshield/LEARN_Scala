/**
  * Created by FRESHIELD on 2016/11/13.
  */
object Twice {

  def apply(s: String): String = s + s

  def unapply(s: String): Option[String] = {
    val length = s.length / 2
    val half = s.substring(0, length)
    if (half == s.substring(length)) {
      println("twice " + half);Some(half)
    } else None
  }

}
