/**
  * Created by FRESHIELD on 2016/10/15.
  */
object DSL {

  def main(args: Array[String]) {

  }

  def inverter(input: Wire, output: Wire): Unit ={

  }
  def andGate(a1: Wire, a2: Wire, output: Wire): Unit ={

  }
  def orGate(o1: Wire, o2: Wire, output: Wire): Unit ={

  }

  def halfAdder(a: Wire, b: Wire, s: Wire, c: Wire): Unit = {
    val d, e = new Wire
    orGate(a, b, d)
    andGate(a, b, c)
    inverter(c, e)
    andGate(d, e, s)
  }

  def fullAdder(a: Wire, b: Wire, cin: Wire, sum: Wire, cout: Wire): Unit ={
    val s, c1, c2 = new Wire
    halfAdder(a, cin, s, c1)
    halfAdder(b, s, sum, c2)
    orGate(c1, c2, cout)
  }



}
