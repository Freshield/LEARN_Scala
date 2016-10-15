/**
  * Created by FRESHIELD on 2016/10/14.
  */
import scala.collection.mutable
import scala.collection.mutable.{HashMap, Map, SynchronizedMap}

object MapMaker {

  def makeMap: Map[String, String] = {
    new HashMap[String, String] with
    SynchronizedMap[String, String] {
      override def default(key: String) =
      "Why do you want to know!"
    }
  }

}
