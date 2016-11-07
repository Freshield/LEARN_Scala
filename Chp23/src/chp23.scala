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

  }

  case class Person(name: String,
                    isMale: Boolean,
                    children: Person*)

}
