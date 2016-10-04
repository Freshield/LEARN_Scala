/**
  * Created by FRESHIELD on 2016/10/3.
  */
class LineElement(s: String) extends ArrayElement(Array(s)){

  override def width = s.length

  override def height = 1

  override def demo(): Unit ={
    println("lineelement")
  }
}
