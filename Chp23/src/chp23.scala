/**
  * Created by FRESHIELD on 2016/11/6.
  */
object chp23 {

  def main(args: Array[String]) {
    val lara = Person("Lara", false)
    val bob = Person("Bob", true)
    val julie = Person("Julie", false, lara, bob)
    val persons = List(lara, bob, julie)
    val pairs = persons filter (p => !p.isMale) flatMap (p => (p.children map (c => (p.name, c.name))))
    pairs.foreach(println)

    val pair1 = for (p <- persons; if !p.isMale; c <- p.children)
      yield (p.name, c.name)

    pair1.foreach(println)

    val pair2 = for {
      p <- persons
      n = p.name
      if (n startsWith "L")
  } yield n

    pair2.foreach(println)

    val pair3 = for {
      x <- List(1,2)
      y <- List("one","two")
    } yield (x, y)

    pair3.foreach(println)

    println(queens(8).length)

  }

  def queens(n: Int): List[List[(Int, Int)]] = {
    def placeQueens(k: Int): List[List[(Int, Int)]] =
      if (k == 0)
        List(List())
      else
        for {
          queens <- placeQueens(k - 1)
          column <- 1 to n
          queen = (k, column)
          if isSafe(queen, queens)
        } yield queen :: queens

    def isSafe(queen: (Int, Int), queens: List[(Int, Int)]) =
      queens forall(q => !inCheck(queen, q))

    def inCheck(q1: (Int, Int), q2: (Int, Int)) =
      q1._1 == q2._1 ||
      q1._2 == q2._2 ||
        Math.abs(q1._1 - q2._1) == Math.abs(q1._2 - q2._2)

    placeQueens(n)
  }

  case class Person(name: String,
                    isMale: Boolean,
                    children: Person*)

}
