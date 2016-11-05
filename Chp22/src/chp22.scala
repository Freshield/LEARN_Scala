/**
  * Created by FRESHIELD on 2016/11/5.
  */
object chp22 {

  def main(args: Array[String]) {
    val xs = List(1,2,3)
    val ys: List[Any] = xs
    ys.foreach(println)

    abstract class Fruit
    class Apple extends Fruit
    class Orange extends Fruit

    val apples = new Apple :: Nil
    println(apples)
    val fruits = new Orange :: apples
    println(fruits)
  }

}
