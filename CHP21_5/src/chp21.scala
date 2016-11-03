/**
  * Created by FRESHIELD on 2016/11/2.
  */


object chp21 {

  def main(args: Array[String]) {
    //println(stringWrapper("abc123") exists (_.isDigit))

    println("abc123" exists(_.isDigit))

    println("try to do something")

    //println(printWithSpaces(stringWrapper("xyz")))

    println("fix")

    println("test on centos")



  }
/*
  implicit def stringWrapper(s: String) =
    new IndexedSeq[Char] {
      def length = s.length

      def apply(i: Int) = s.charAt(i)
    }
*/
  def printWithSpaces(seq: IndexedSeq[Char]) =
    seq mkString("/")

  implicit def intToString(x: Int) = x.toString

}
