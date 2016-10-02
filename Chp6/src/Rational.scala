/**
  * Created by FRESHIELD on 2016/10/2.
  */
class Rational (n: Int, d: Int){

  require(d!=0)

  private val g = gcd(n.abs, d.abs)
  val number: Int = n / g
  val denom: Int = d / g

  def this(n: Int) = this(n,1)

  private def gcd(a: Int, b: Int): Int =
    if(b == 0) a else gcd(b, a % b)

  override def toString = number + "/" + denom

  def add(that: Rational): Rational =
    new Rational(
      number * that.denom + that.number * denom,
      denom * that.denom
    )

  def +(that: Rational): Rational = add(that)
  def +(that: Int): Rational = this + new Rational(that,1)

  def - (that: Rational): Rational =
    new Rational(
      number * that.denom - that.number * denom,
      denom * that.denom
    )
  def -(that: Int): Rational = this - new Rational(that,1)

  def *(that: Rational): Rational =
    new Rational(number * that.number, denom * that.denom)
  def *(that: Int): Rational = this * new Rational(that,1)

  def /(that: Rational): Rational =
    new Rational(number * that.denom, denom * that.number)
  def /(that: Int): Rational = this / new Rational(that,1)

  def lessThan(that: Rational) =
    this.number * that.denom < that.number * this.denom


  def max(that: Rational) =
    if (this.lessThan(that)) that else this



}
