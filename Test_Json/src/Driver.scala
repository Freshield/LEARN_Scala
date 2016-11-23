/**
  * Created by FRESHIELD on 2016/11/23.
  */
import net.liftweb.json._
import net.liftweb.json.JsonDSL._


object Driver {

  def main(args: Array[String]) {
    val jsonString =parse("""{"numbers":"[1,2,3,4]"}""")

    val json =
      ("person" ->
        ("name" -> "Joe") ~
          ("age" -> 35) ~
          ("spouse" ->
            ("person" ->
              ("name" -> "Marilyn") ~
                ("age" -> 33)
              )
            )
        )
    println(json \ "person" \ "name")
    println(jsonString \ "numbers")

    val json1 = List(1,2,3)
    println(json1)
    println(compact(render(json1)))

    val json2 = {"name" -> "joe"}
    println(json2)
    println(compact(render(json2)))

    val json3 = ("name" -> "joe") ~ ("age" -> 35)
    println(json3)
    println(compact(render(json3)))

    val json4 = ("name" -> "joe") ~ ("age" -> Some(35))
    println(json4)
    println(compact(render(json4)))

    val json5 = ("name" -> "joe") ~ ("age" -> (None: Option[Int]))
    println(json5)
    println(compact(render(json5)))
  }

}
