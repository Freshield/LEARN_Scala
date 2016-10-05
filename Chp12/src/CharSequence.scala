/**
  * Created by FRESHIELD on 2016/10/5.
  */
trait CharSequence {

  def charAt(index: Int): Char
  def length: Int
  def subSequence(start: Int, end: Int): CharSequence
  def toString(): String

}
