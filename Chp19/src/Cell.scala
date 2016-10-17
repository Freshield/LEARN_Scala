/**
  * Created by FRESHIELD on 2016/10/17.
  */
class Cell[T](init: T) {
  private[this] var current = init
  def get = current
  def set(x: T): Unit = {
    current = x
  }

}
