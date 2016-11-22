/**
  * Created by FRESHIELD on 2016/11/21.
  */
trait YTree[+T] {
  def elem: T
  def left: YTree[T]
  def right: YTree[T]

}

object EmptyYTree extends YTree[Nothing] {
  def elem =
    throw new NoSuchElementException("EmptyYTree.elem")
  def left =
    throw new NoSuchElementException("EmptyYTree.left")
  def right =
    throw new NoSuchElementException("EmptyYTree.right")
}

class Branch[+T] (
                 val elem: T,
                 val left: YTree[T],
                 val right: YTree[T]
                 ) extends YTree[T]{
  override def equals(other: Any) = other match {
    case that: Branch[t] => this.elem == that.elem &&
      this.left == that.left &&
      this.right == that.right &&
      (that canEqual this)
    case _ => false
  }

  override def hashCode: Int =
    41 * (
      41 * (
        41 + elem.hashCode()
        ) + left.hashCode()
      ) + right.hashCode()

  def canEqual(other: Any) = other match {
    case that: Branch[_] => true
    case _ => false
  }
}
