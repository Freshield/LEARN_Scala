/**
  * Created by FRESHIELD on 2016/10/19.
  */
trait Abstract {
  type T
  def transform(x: T): T
  val initial: T
  var current: T

}
