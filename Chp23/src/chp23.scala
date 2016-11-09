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

    val books: List[Book] =
      List(
        Book("structure", "abelson", "sussman"),
        Book("principles", "aho", "ullman"),
        Book("programming", "wirth"),
        Book("elements", "ullman"),
        Book("the", "gosling", "joy", "steele", "bracha")
      )

    val pair4 = for (b <- books; a <- b.authors; if a startsWith "gosling")
      yield b.title

    println(pair4)

    val pair5 = for (b <- books if (b.title indexOf "the") >= 0)
      yield b.title

    println(pair5)
    pair5.foreach(println)

    val pair6 = for (b1 <- books; b2 <- books if b1 != b2;
    a1 <- b1.authors; a2 <- b2.authors if a1 == a2)
      yield a1

    removeDuplicates(pair6).foreach(println)

    val list1 = List(1,2,3,4)

    println(for (x <- list1) yield x)
    println(list1.map(x => x))

    println("interesting")


    val test = List("coffee panda", "happy panda")
    val test1 = test.map(x => x.split(" "))
    test.flatMap(x => x.split(" ")).foreach(println)
    test1.foreach(_.foreach(println))


  }

  def removeDuplicates[A](xs: List[A]): List[A] = {
    if (xs.isEmpty) xs
    else
      xs.head :: removeDuplicates(
        xs.tail filter(x => x != xs.head)
      )
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
      queens forall (q => !inCheck(queen, q))

    def inCheck(q1: (Int, Int), q2: (Int, Int)) =
      q1._1 == q2._1 ||
        q1._2 == q2._2 ||
        Math.abs(q1._1 - q2._1) == Math.abs(q1._2 - q2._2)

    placeQueens(n)
  }



  case class Person(name: String,
                    isMale: Boolean,
                    children: Person*)

  case class Book(title: String, authors: String*)

}
