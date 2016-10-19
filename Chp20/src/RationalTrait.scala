/**
  * Created by FRESHIELD on 2016/10/19.
  */
trait RationalTrait {

  val numerArg: Int
  val denomArg: Int
  require(denomArg != 0)
  private val g = gcd(numerArg, denomArg)
  val numer = numerArg / g
  val denom = denomArg / g
  override def toString = numer + "/" + denom



  private def gcd(a: Int, b: Int): Int =
    if(b == 0) a else gcd(b, a % b)


}
