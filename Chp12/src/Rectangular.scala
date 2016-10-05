/**
  * Created by FRESHIELD on 2016/10/5.
  */
trait Rectangular {


  def topLeft: Point
  def bottomRight: Point

  def left = topLeft.x
  def right = bottomRight.x
  def width = right - left


}
