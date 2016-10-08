/**
  * Created by FRESHIELD on 2016/10/6.
  */
import bobsdelights.Fruit

object chp13 {

  def main(args: Array[String]) {
    Fruit.menu.foreach(showFruit)

    println(Rocket.fuel2)
    val test = new Rocket
    test.add
    println(Rocket.fuel2)
    Rocket.fuel2 += 10
    println(Rocket.fuel2)
  }

  def showFruit(fruit: Fruit): Unit ={
    import fruit.{name => xxx,_}
    println(xxx + "s are " + color)
  }

}
