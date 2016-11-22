/**
  * Created by FRESHIELD on 2016/11/21.
  */
class ColoredPoint(x: Int, y: Int, val color: Color.Value) extends Point(x, y){

  override def equals(other: Any) = other match {
    case that: ColoredPoint =>
      this.color == that.color && super.equals(that)
    case _ => false
  }

  override def canEqual(other: Any) =
    other.isInstanceOf[ColoredPoint]

}
