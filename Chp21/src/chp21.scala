import java.util.RandomAccess

/**
  * Created by FRESHIELD on 2016/10/18.
  */

object chp21{
  def main(args: Array[String]) {
    println(stringWrapper("abc123") exists (_.isDigit))

    println("try to do something")
  }

  implicit def stringWrapper(s: String) =
    new IndexedSeq[Char] {
      def length = s.length

      def apply(i: Int) = s.charAt(i)
    }

}
