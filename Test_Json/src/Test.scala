/**
  * Created by FRESHIELD on 2016/11/23.
  */
import net.liftweb.json._
import net.liftweb.json.JsonDSL._
import net.liftweb.json.Extraction._

abstract class MyObjects
case class Apple(id: Int, name: String, color: String) extends MyObjects
case class Orange(id: Long, name: String, state: String) extends MyObjects

case class Fruits(aisle: Int, bin: Int, hasWhat: Option[List[MyObjects]])

object Test{
  // This configuration adds an extra field for MyObjects to JSON
  // which tells the real type of a MyObject.
  def main(args: Array[String]) {
    implicit val formats = Serialization.formats(FullTypeHints(List(classOf[MyObjects])))

    val fs = Fruits(0, 0, Some(List(
      Apple(1, "Granny Smith", "green"),
      Apple(2, "Grenade", "red"))))
    val json = decompose(fs)
    println(pretty(render(json)))

    assert (json.extract[Fruits] == fs)
  }

}
