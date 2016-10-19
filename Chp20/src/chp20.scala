/**
  * Created by FRESHIELD on 2016/10/19.
  */
object chp20 {

  def main(args: Array[String]) {
    //val test = new testApple
    //println(test.v)
    //println(test.m)

    val test = new testTime
    println(test.hour)
    println(test.minute)
    test.hour_=(2)
    println(test.hour)

    val test1 = new {
      val numerArg = 1
      val denomArg = 2
    } with RationalTrait

    println(test1.denomArg)
    println(test1.numerArg)

    println(twoThirds.denom)
    println(twoThirds.numer)

    Demo
    println(Demo.x)

    val test2 = new LayRationalTrait {
      val numerArg = 2
      val denomArg = 4
    }

    println(test2.numer)
    println(test2.denom)

    println(test2.getClass)

    val bessy = new Cow
    val lassie = new Dog
    val bootsie = new Dog


    lassie eat (new bootsie.SuitableFood)

    for (d1 <- Direction.values) println(d1)

    println(Direction.East.id)

    println(Direction(1))

  }

}
