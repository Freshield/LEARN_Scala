/**
  * Created by FRESHIELD on 2016/10/1.
  */
import scala.collection.mutable.Map

object chp4 {

  /*
  def main(args: Array[String]) {
    val acc = new ChecksumAccumulator
    val csa = new ChecksumAccumulator

    println(acc.h())

    ChecksumAccumulatoring.calculate("every value")
  }
  */

}


class ChecksumAccumulator{
  private var sum = 0

  def h() = {"this string gets returned"}

  def add(b: Byte) {sum += b}

  def checksum() : Int = ~(sum & 0xFF) + 1
}
