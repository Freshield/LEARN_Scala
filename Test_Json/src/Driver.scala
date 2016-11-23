/**
  * Created by FRESHIELD on 2016/11/23.
  */
import net.liftweb.json._
import net.liftweb.json.JsonDSL._


object Driver {

  def main(args: Array[String]) {
    val jsonString =
      """ {"user":{
        |"user1":{"name":"Unmi","email":"fantasia@sina.com"},
        |"user2":{"name":"Unmi.cc","email":"unmi@unmi.cc"}
        |}}""".stripMargin

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
    println(compact(render(json \ "person" \ "name")))
    println(json)
    //println(maybeName)
    //val emails = (json \ "user" \\ "email").map(_.as[String])
    //println(emails)
  }

}
