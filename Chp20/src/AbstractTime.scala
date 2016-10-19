/**
  * Created by FRESHIELD on 2016/10/19.
  */
trait AbstractTime {
  var hour: Int
  var minute: Int

}

trait AbstractTime1{
  def hour: Int
  def hour_=(x: Int)
  def minute: Int
  def minute_=(x: Int)
}

class testTime extends AbstractTime{
  var hour = 0
  var minute = 0
}