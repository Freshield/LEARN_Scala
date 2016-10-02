import scala.io.StdIn

/**
  * Created by FRESHIELD on 2016/10/2.
  */
object chp7 {

  def main(args: Array[String]) {
    val filename =
      if (!args.isEmpty) args(0)
      else "default.txt"

    println(filename)

    def gcdLoop(x: Long, y: Long): Long = {
      var a = x
      var b = y
      while (a != 0){
        val temp = a
        a = b % a
        b = temp
      }
      b
    }
/*
    var line = ""
    do{
      line = StdIn.readLine()
      println("read: " + line)
    }while(line != "")
*/
    def greet() {println("hi")}
    def greet1() = println("hello")
    println(greet == greet1)
/*
    var line = ""
    while ((line = StdIn.readLine()) != "")
      println("read: " + line)
*/
    def printReadline(): Boolean = {
      val temp = StdIn.readLine()
      println("read: " + temp)
      if (temp == "") true
      else printReadline()
    }

    printReadline()

  }

}
