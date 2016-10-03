/**
  * Created by FRESHIELD on 2016/10/3.
  */
import scala.io.Source

object LongLines {

  def processFile(filename: String, width: Int): Unit = {

    def processLine(line: String): Unit ={
      if (line.length > width)
        println(filename + ": " + line.trim)
    }


    val source = Source.fromFile(filename)
    for (line <- source.getLines())
      processLine(line)
  }

}
