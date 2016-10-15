/**
  * Created by FRESHIELD on 2016/10/15.
  */
object chp18 {

  def main(args: Array[String]) {
    val cs = List('a','b','c')

    val account = new BankAccount

    println(account deposit 100)
    println(account balance)
    println(account withdraw 80)
    println(account balance)
    println(account withdraw 80)
    println(account balance)

    var hour = 12
    println(hour)
    hour = 13
    println(hour)
    hour = 14
    println(hour)

    val t = new Thermometer
    t.celsius = 100
    println(t)
    t.fahrenheit = -40
    println(t)
  }

}
