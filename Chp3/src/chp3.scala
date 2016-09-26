import java.math.BigInteger

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

    for (i <- 0.to(2))
      print(greetString.apply(i))

    println(1.+(2))

    val numNames = Array("zero","one","two")
    numNames.foreach(println)
  }

}
