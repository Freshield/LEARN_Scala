/**
  * Created by FRESHIELD on 2016/11/13.
  */
object UpperCase {

  def unapply(s: String): Boolean = {println("uppercase " + s); s.toUpperCase == s}

}
