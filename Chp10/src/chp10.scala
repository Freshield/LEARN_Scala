/**
  * Created by FRESHIELD on 2016/10/3.
  */
object chp10 {

  def main(args: Array[String]) {

    val ae = new ArrayElement(Array("hello","world"))
    println(ae.width)


    val e: Element = new ArrayElement(Array("hello"))

    println(e.width)

    val e1: Element = new ArrayElement(Array("hello","world"))
    val ae1: ArrayElement = new LineElement("hello")
    val e2: Element = ae1
    val e3: Element = new UniformElement('x',2,3)
    val e4: Element = new LineElement("test")

    e3.contents.foreach(println)
    e4.contents.foreach(println)

    e1.demo()
    ae1.demo()
    e2.demo()
    e3.demo()
    e4.demo()





  }

}
