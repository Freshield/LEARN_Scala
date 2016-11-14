/**
  * Created by FRESHIELD on 2016/11/13.
  */
object IsTwice {

  def isTwice(s: String) = {
    s match {
      case Twice(word) => println(word)
      case _ => println("not match")
    }
  }

}
