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

    val therm = new CCTherm {
      override val condition: Int = 9
      override val description: String = "hot dog #5"
      override val yearMade: Int = 1952
      override val dateObtained: String = "March 14, 2006"
    }

    println(therm)
    println(therm.toXML)

    val elem5 = <a> Sounds <tag/> good </a>.text
    println(elem5)

    println(<a> input ----&gt; output</a>.text)

    val elem6 = <a name="a"><b name="b"><c>hello</c></b></a>

    println(elem6 \\ "@name")

    val joe = <employee
    name = "Joe"
    rank = "code monkey"
    serial = "123"
      />

    println(joe \ "@name")
    println(joe \ "@serial")

  }

}
