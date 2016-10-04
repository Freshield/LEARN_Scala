/**
  * Created by FRESHIELD on 2016/10/4.
  */
import Element.elem

object Spiral {
  val space = elem (" ")
  val corner = elem ("+")
  def spiral(nEdges:Int, direction:Int): Element = {
    if(nEdges==1)
      elem("+")
    else{
      val sp=spiral(nEdges -1, (direction +3) % 4)
      def verticalBar = elem ('|',1, sp.height)
      def horizontalBar = elem('-',sp.width,1)
      if(direction==0)
        (corner beside horizontalBar) above (sp beside space)
      else if (direction ==1)
        (sp above space) beside ( corner above verticalBar)
      else if(direction ==2 )
        (space beside sp) above (horizontalBar beside corner)
      else
        (verticalBar above corner) beside (space above sp)
    }
  }
  def main(args:Array[String]) {


    val e1 = Element.elem('+',5,5)
    val e2 = Element.elem(Array("123","2345"))
    val e3 = e2 above e1
    val e4 = e1 beside e2

    e1.contents.foreach(println)
    e2.contents.foreach(println)
    e3.contents.foreach(println)
    e4.contents.foreach(println)

    val nSides=6
    println(spiral(nSides,0))
  }
}