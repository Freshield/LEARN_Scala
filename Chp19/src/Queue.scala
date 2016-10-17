/**
  * Created by FRESHIELD on 2016/10/17.
  */
class Queue[T] (
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

  def append(x: T) =
    new Queue(leading, x :: trailing)
}
