/**
  * Created by FRESHIELD on 2016/10/3.
  */
object chp10 {

  def main(args: Array[String]) {
/*
    val ae = new ArrayElement(Array("hello","world"))
    println(ae.width)


    val e: Element = new ArrayElement(Array("hello"))

    println(e.width)

    val e1: Element = new ArrayElement(Array("hello","world"))
    val ae1: Element = new LineElement("hello")
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
    */

    (Array(1,2,3) zip Array("a","b")).foreach(println)

    val e1 = Element.elem('+',5,5)
    val e2 = Element.elem(Array("123","2345"))
    val e3 = e2 above e1
    val e4 = e1 beside e2

    e1.contents.foreach(println)
    e2.contents.foreach(println)
    e3.contents.foreach(println)
    e4.contents.foreach(println)


    println(3 % 4)


  }

}
