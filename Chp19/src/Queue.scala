
/**
  * Created by FRESHIELD on 2016/10/17.
  */
class Queue[T] private(
  private val leading: List[T],
  private val trailing: List[T]
){
  private  def mirror = {
    if (leading.isEmpty)
      new Queue(trailing.reverse, Nil)
    else
      this
  }

  def head = mirror.leading.head

  def tail = {
    val q = mirror
    new Queue(q.leading.tail, q.trailing)
  }

  def goPrint(): Unit ={
    leading.foreach(println)
    trailing.reverse.foreach(println)
  }

  def append[U>: T](x: U) =
    new Queue[U](leading, x :: trailing)

}

object Queue{
  def apply[T](xs: T*)= new Queue[T](xs.toList, Nil)
}
