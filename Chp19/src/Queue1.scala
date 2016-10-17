/**
  * Created by FRESHIELD on 2016/10/17.
  */
trait Queue1[T] {
  def head: T
  def tail: Queue1[T]
  def append(x: T): Queue1[T]

}

object Queue1{
  def apply[T](xs: T*): Queue1[T] = new QueueImpl[T](xs.toList, Nil)

  private class QueueImpl[T](
                            private val leading: List[T],
                            private val trailing: List[T]
                            )extends Queue1[T]{
    private  def mirror = {
      if (leading.isEmpty)
        new QueueImpl(trailing.reverse, Nil)
      else
        this
    }

    def head = mirror.leading.head

    def tail = {
      val q = mirror
      new QueueImpl(q.leading.tail, q.trailing)
    }

    def append(x: T) =
      new QueueImpl(leading, x :: trailing)

  }
}
