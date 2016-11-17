/**
  * Created by FRESHIELD on 2016/11/17.
  */
import scala.xml._

object chp26 {

  def main(args: Array[String]) {
    val elem = <a>
    This is some XML.
    Here is a tag: <atag/>
    </a>

    println(elem)
  }

}
