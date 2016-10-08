/**
  * Created by FRESHIELD on 2016/10/7.
  */
class Rocket {

  import Rocket.fuel

  def fuel1 = 20

  def add: Unit ={
    Rocket.fuel2 += 1
  }

  private def canGoHomeAgain = fuel > 20

}

object Rocket{

  var fuel2 = 1

  private def fuel = 10

  def chooseStrategy(rocket: Rocket): Unit ={
    if (rocket.canGoHomeAgain)
      goHome()
    else
      pickAStar()

  }

  def goHome(){}

  def pickAStar(){}
}
