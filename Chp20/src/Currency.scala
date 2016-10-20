/**
  * Created by FRESHIELD on 2016/10/20.
  */
abstract class Currency {
  val amount: Long
  def designation: String
  override def toString = amount + " " + designation
  //def + (that: Currency): Currency
  //def * (x: Double): Currency

}
