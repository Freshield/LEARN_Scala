/**
  * Created by FRESHIELD on 2016/10/17.
  */
class QueueN[+T] private(
                 private[this] var leading: List[T],
                 private[this] var trailing: List[T]
                 ){

  private def mirror() = {
    if (leading.isEmpty)
      while(!trailing.isEmpty) {
        leading = trailing.head :: leading
        trailing = trailing.tail
      }
  }

  def head: T = {
    mirror()
    leading.head
  }

  def tail: QueueN[T] = {
    mirror()
    new QueueN(leading.tail, trailing)
  }

  override def toString() =
    (leading ::: trailing.reverse) mkString ("Queue(", ", ", ")")

  def append[U >: T](x: U) = {
    new QueueN[U](leading, x :: trailing)
  }
}

object QueueN{
  def apply[T](xs: T*)= new QueueN[T](xs.toList, Nil)
}


