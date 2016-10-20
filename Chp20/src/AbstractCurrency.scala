/**
  * Created by FRESHIELD on 2016/10/20.
  */
abstract class AbstractCurrency {
  type Currency <: AbstractCurrency
  val amount: Long
  def designation: String
  override def toString = amount + " " + designation

}


