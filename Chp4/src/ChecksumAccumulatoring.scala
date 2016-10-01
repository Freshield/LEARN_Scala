/**
  * Created by FRESHIELD on 2016/10/1.
  */
import scala.collection.mutable.Map

object ChecksumAccumulatoring {

  private val cache = Map[String, Int]()

  def calculate(s: String) : Int = {
    if (cache.contains(s)){
      cache(s)
    }
    else {
      val acc = new ChecksumAccumulator
      for (c <- s){
        acc.add(c.toByte)
      }
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
  }

}

class ChecksumAccumulatoring{
  private var sum = 0

  def h() = {"this string gets returned"}

  def add(b: Byte) {sum += b}

  def checksum() : Int = ~(sum & 0xFF) + 1
}
