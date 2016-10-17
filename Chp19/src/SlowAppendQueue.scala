/**
  * Created by FRESHIELD on 2016/10/17.
  */
class SlowAppendQueue[T](elems: List[T]) {
  def head = elems.head
  def tail = new SlowAppendQueue(elems.tail)
  def append(x: T) = new SlowAppendQueue(elems ::: List(x))

}
