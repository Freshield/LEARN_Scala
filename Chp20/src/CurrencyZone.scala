/**
  * Created by FRESHIELD on 2016/10/20.
  */
abstract class CurrencyZone {
  type Currency <: AbstractCurrency1
  val CurrencyUnit: Currency
  def make(x: Long): Currency

  abstract class AbstractCurrency1{
    val amount: Long
    def designation: String
    override def toString = {
      (amount.toDouble / CurrencyUnit.amount.toDouble) formatted
        ("%."+ deciamls(CurrencyUnit.amount) + "f" + " " + designation)

    }
    private def deciamls(n: Long): Int =
      if(n == 1) 0 else 1 + deciamls(n / 10)
    def + (that: Currency): Currency =
      make(this.amount + that.amount)
    def * (x: Double): Currency =
      make((this.amount * x).toLong)
    def from(other: CurrencyZone#AbstractCurrency1): Currency =
      make(Math.round(
        other.amount.toDouble * Converter.exchangeRate(other.designation)(this.designation)
      ))
  }

}

object US extends CurrencyZone{
  abstract class Dollar extends AbstractCurrency1{
    def designation = "USD"
  }
  type Currency = Dollar
  def make(cents: Long) = new Dollar {
    val amount: Long = cents
  }
  val Cent = make(1)
  val Dollar = make(100)
  val CurrencyUnit = Dollar

}

object Europe extends CurrencyZone{
  abstract class Euro extends AbstractCurrency1{
    def designation = "EUR"
  }
  type Currency = Euro
  def make(cents: Long) = new Euro {
    override val amount: Long = cents
  }
  val Cent = make(1)
  val Euro = make(100)
  val CurrencyUnit = Euro
}

object Japan extends CurrencyZone{
  abstract class Yen extends AbstractCurrency1{
    def designation = "JPY"
  }
  type Currency = Yen
  def make(yen: Long) = new Yen {
    override val amount: Long = yen
  }
  val Yen = make(1)
  val CurrencyUnit = Yen
}

object Converter{
  var exchangeRate = Map(
    "USD" -> Map("USD" -> 1.0D, "EUR" -> 0.75D, "JPY" -> 1.2D),
    "EUR" -> Map("USD" -> 1.3D, "EUR" -> 1D, "JPY" -> 1.6D),
    "JPY" -> Map("USD" -> 0.8D, "EUR" -> 0.6D, "JPY" -> 1D)
  )
}


