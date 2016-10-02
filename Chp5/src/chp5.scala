/**
  * Created by FRESHIELD on 2016/10/1.
  */
object chp5 {

  def main(args: Array[String]) {
    val hex = 0x5
    println(hex)
    val hex2 = 0x00ff
    println(hex2)
    val magic = 0xcafebabe
    println(magic)

    val dec1 = 31
    println(dec1)
    val dec2 = 255
    println(dec2)

    val of = 31l
    println(of)

    val little: Byte = 23

    val big = 1.234
    println(big)
    val bigger = 1.234e1
    println(bigger)
    val biggerStill = 123E45
    println(biggerStill)

    val yetAnother = 3e5d
    println(yetAnother)

    val c = '\101'
    println(c)

    val d = '\u0041'
    println(d)

    val hello = "hello"
    println(hello.getClass)

    val escapes = "\\\"\'"
    println(escapes)
    println(
      """|Welcome to ultamix type
        |"help" for help """.stripMargin)

    def updateRecordByName(r: Symbol, value: Any): Unit ={
      println(r)
      println("here")
    }

    val favoriteAlbum = 1
    updateRecordByName('favoriteAlbum, "ok computer")

    val sum = 1 + 2
    println(sum)
    val longSum = 1 + 2l
    println(longSum.getClass)

    val s = "hello, world"
    println(s)
    println(s indexOf 'o')
    println(s indexOf ('o',5))

    println(-2.0)
    println((2.0).unary_-)

    val s1 = "hello,world"
    println(s1.toLowerCase)
    println(s1 toLowerCase)

    println(Math.IEEEremainder(11.0,4.0))

    def salt() = { println("salt"); false}
    def pepper() = {println("pepper"); true}

    println(salt() && pepper())

    println(List(1,2,3) == List(1,2,3))
    println(List(1,2,3) == List(4,5,6))

    println(1 == 1.0f)

    println(List() == null)

    val twoThree = List(2,3)
    val test = (1 :: Nil) ::: twoThree
    println(test)



  }

}
