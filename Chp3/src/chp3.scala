import java.math.BigInteger
import scala.collection.mutable.Set
import scala.collection.immutable.HashSet
//import scala.collection.mutable.Map

/**
  * Created by FRESHIELD on 2016/9/25.
  */
object chp3 {

  def main(args: Array[String]) {
    println("here")

    val big = new BigInteger("12345")
    println(big)

    val greetString = new Array[String](3)

    greetString(0) = "hello"
    greetString(1) = ","
    greetString(2) = "world!\n"

    val test = Array(1,2,3)
    test.foreach(println)

    for (i <- 0.to(2))
      print(greetString.apply(i))

    println(1.+(2))

    val numNames = Array("zero","one","two")
    numNames.foreach(println)

    //val oneTwoThree = List(1,2,3)

    val oneTwo = List(1,2)
    val threeFour = List(3,4)
    val oneTwoThreeFour = oneTwo ::: threeFour
    println(""+ oneTwo + " and " + threeFour + " were not mutated")
    println("thus," + oneTwoThreeFour+" is a new List")

    val twoThree = List(2,3)
    val oneTwoThree = 1 :: twoThree
    println(oneTwoThree)

    val theOneTwoThree = 1 :: 2 :: 3 :: Nil
    println(theOneTwoThree)

    val thrill = "will" :: "fill" :: "until" :: Nil

    println(thrill)
    println(thrill(2))
    println(thrill.count(s => s.length == 4))
    println(thrill.drop(2))
    println(thrill.dropRight(2))
    println(thrill.exists(s => s == "until"))

    println(thrill.filter(s => s.length == 4))

    println(thrill.forall(s => s.endsWith("l")))
    thrill.foreach(s => print(s+" "))
    thrill.foreach(println)
    println(thrill.head)
    println(thrill.init)
    println(thrill.isEmpty)
    println(thrill.last)
    println(thrill.length)
    println(thrill.map(s => s + "y"))

    println(thrill.mkString(", "))
    println(thrill.filter(s => s.length != 4))
    println(thrill.filterNot(s => s.length == 4))
    println(thrill.reverse)
    println(thrill.sortWith((s,t) => s.charAt(0).toLower < t.charAt(0).toLower))
    println(thrill.tail)

    val pair = (99,"luftbalons")
    println(pair._1)
    println(pair._2)

    var jetSet = Set("boeing","airbus")
    jetSet += "lear"
    println(jetSet.contains("cessna"))

    val movieSet = Set("hitch","poltergeist")
    movieSet += "shrek"
    println(movieSet)

    val hashSet = HashSet("tomatoes","chilies")
    println(hashSet + "coriander")

    var treasureMap = Map[Int, String]()
    treasureMap += (1 -> "go to island")
    treasureMap += (2 -> "find big x on ground")
    treasureMap += (3 -> "dig")

    println(treasureMap(2))

    val romanNumberal = Map(1 -> "i", 2 -> "ii", 3 -> "iii")
    println(romanNumberal(3))



  }

}
