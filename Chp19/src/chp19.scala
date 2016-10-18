/**
  * Created by FRESHIELD on 2016/10/17.
  */
object chp19 {

  def main(args: Array[String]) {
    val test = Queue[Int](1,2,3,4,5)
    println(test.head)
    println(test.tail)

    val a1 = Array("abc")
    //val a2: Array[Any] = a1
    val a2: Array[Any] = a1.asInstanceOf[Array[Any]]
    println(a2.getClass)

    //val x: Queue[Any] = new StrangeIntQueue
    //x.append("abc")

    val apple = Queue[Apple](new Apple())

    val orange = new Orange

    val fruit = apple append orange

    println(classOf[Queue[Fruit]] == fruit.getClass)

    println(fruit.head.getClass)

    println(fruit.tail.head.getClass)

    fruit.goPrint()

    val intqueue = QueueN[Int](1,2,3,4,5)

    println(intqueue)

    val robert = new Person("Robert", "Smith")
    println(robert)
    val sally = new Person("Sally", "Smith")
    println(sally)
    println(robert < sally)

    val people = List(
      new Person("larry","wall"),
      new Person("anders","hejlsbery"),
      new Person("guido","van rossum"),
      new Person("alan","kay"),
      new Person("yukihiro","matsumoto")
    )

    people.foreach(println)

    println()

    val sortedPeople = orderedMergeSort(people)

    sortedPeople.foreach(println)

  }

  def orderedMergeSort[T <: Ordered[T]](xs: List[T]): List[T] = {

    def merge(xs: List[T], ys: List[T]): List[T] = {
      (xs, ys) match {
        case (Nil,_) => ys
        case (_, Nil) => xs
        case (x :: xs1, y :: ys1) =>
          if(x < y) x :: merge(xs1, ys)
          else y :: merge(xs, ys1)
      }
    }
    val n = xs.length / 2
    if (n == 0) xs
    else {
      val (ys, zs) = xs splitAt n
      merge(orderedMergeSort(ys), orderedMergeSort(zs))
    }

  }

}
