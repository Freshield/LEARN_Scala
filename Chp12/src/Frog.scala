/**
  * Created by FRESHIELD on 2016/10/5.
  */
class Animal
trait HasLegs

class Frog extends Animal with Philosophical with HasLegs{

  override def toString = "green"

  override def philosophize(): Unit ={
    println("It ain't wasy being "+toString+"!")
  }

}
