/**
  * Created by FRESHIELD on 2016/10/17.
  */
object chp19 {

  def main(args: Array[String]) {
    val test = Queue[Int](1,2,3,4,5)
    println(test.head)
    println(test.tail)

    val a1 = Array("abc")
    //val a2: Array[Any] = a1
    val a2: Array[Any] = a1.asInstanceOf[Array[Any]]
    println(a2.getClass)

    //val x: Queue[Any] = new StrangeIntQueue
    //x.append("abc")

  }

}
