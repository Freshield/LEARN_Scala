/**
  * Created by FRESHIELD on 2016/10/19.
  */
abstract class Fruit {
  val v: String
  def m: String

}

abstract class Apple extends Fruit{
  val v: String
  val m: String
}

abstract class BadApple extends Fruit{
  def v: String
  def m: String
}

class testApple extends BadApple{
  def v = "hi"
  def m = v
}
