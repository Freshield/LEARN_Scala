/**
  * Created by FRESHIELD on 2016/10/5.
  */
class Rathional(n: Int, d: Int) extends Ordered[Rathional]{

  require(d!=0)

  private val g = gcd(n.abs, d.abs)
  val number: Int = n / g
  val denom: Int = d / g

  def this(n: Int) = this(n,1)

  private def gcd(a: Int, b: Int): Int =
    if(b == 0) a else gcd(b, a % b)

  override def toString = number + "/" + denom

  def add(that: Rathional): Rathional =
    new Rathional(
      number * that.denom + that.number * denom,
      denom * that.denom
    )

  def +(that: Rathional): Rathional = add(that)
  def +(that: Int): Rathional = this + new Rathional(that,1)

  def - (that: Rathional): Rathional =
    new Rathional(
      number * that.denom - that.number * denom,
      denom * that.denom
    )
  def -(that: Int): Rathional = this - new Rathional(that,1)

  def *(that: Rathional): Rathional =
    new Rathional(number * that.number, denom * that.denom)
  def *(that: Int): Rathional = this * new Rathional(that,1)

  def /(that: Rathional): Rathional =
    new Rathional(number * that.denom, denom * that.number)
  def /(that: Int): Rathional = this / new Rathional(that,1)

  def lessThan(that: Rathional) =
    this.number * that.denom < that.number * this.denom


  def max(that: Rathional) =
    if (this.lessThan(that)) that else this
/*
  def < (that: Rathional) = lessThan(that)

  def > (that: Rathional) = that < this

  def <= (that: Rathional) = (this < that) || (this == that)

  def >= (that : Rathional) = (this > that) || (this == that)
*/
  def compare(that: Rathional) =
  (this.number * that.denom) - (that.number * this.denom)



}
