/**
  * Created by FRESHIELD on 2016/11/20.
  */
import scala.collection.mutable._

object chp28 {

  def main(args: Array[String]) {
    val p1, p2 = new Point(1, 2)

    val q = new Point(2, 3)

    println(p1 equals p2)
    println(p1 equals q)

    val coll = HashSet(p1)

    println(coll contains p2)

    val p2a: Any = p2

    println(p1 equals p2a)


    val p = new Point(1, 2)

    val cp = new ColoredPoint(1, 2, Color.red)

    println()
    println(p equals cp)
    println(cp equals p)

    println(HashSet[Point](p) contains cp)
    println(HashSet[Point](cp) contains p)

    val redp = new ColoredPoint(1, 2, Color.red)
    val bluep = new ColoredPoint(1, 2, Color.blue)

    println(redp == p)
    println(p == bluep)
    println(redp == bluep)

    val pAnon = new Point(1, 1){override val y = 2}

    val colll = List(p)

    println(colll contains p)
    println(colll contains cp)
    println(colll contains pAnon)


    

  }

}
