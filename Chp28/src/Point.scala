/**
  * Created by FRESHIELD on 2016/11/21.
  */
class Point(val x: Int, val y: Int) {

  override def hashCode = 41 * (41 + x) + y

  override def equals(other: Any): Boolean = other match {
    case that: Point => this.x == that.x && this.y == that.y &&
      (that canEqual this)
    case _ => false
  }
  def canEqual(other: Any) = other.isInstanceOf[Point]

}
