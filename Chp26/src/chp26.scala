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

    val elem1 = <a> {"hello" + ", world"} </a>
    println(elem1)

    val yearMade = 1955

    val elem2 = <a>
      {if (yearMade < 2000) <old>{yearMade}</old>
       else xml.NodeSeq.Empty}
    </a>

    println(elem2)

    val elem3 = <a>{3 + 4}</a>
    println(elem3)

    val elem4 = <a>{"</a>potential security hole<a>"}</a>
    println(elem4)

    
  }

}
