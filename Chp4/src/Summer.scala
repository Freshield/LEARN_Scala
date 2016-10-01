/**
  * Created by FRESHIELD on 2016/10/1.
  */
import ChecksumAccumulatoring.calculate

object Summer {

  def main(args: Array[String]) {
    for (arg <- args){
      println(arg + ": " + calculate(arg))
    }
  }

}
