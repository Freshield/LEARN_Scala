/**
  * Created by FRESHIELD on 2016/10/19.
  */
class Concrete extends Abstract{
  type T = String
  def transform(x: String) = x + x
  val initial = "hi"
  var current = initial



}
