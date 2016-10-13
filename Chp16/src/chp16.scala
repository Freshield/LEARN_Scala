/**
  * Created by FRESHIELD on 2016/10/12.
  */
object chp16 {

  def main(args: Array[String]) {
    //def printAll(numbers: Int*) {
    //  numbers.foreach(println)
    //}

    //printAll(1,2,3,4)

    val fruit = List("apples","oranges","pears")
    val nums = List(1,2,3,4)
    val diag3 =
      List(
        List(1,0,0),
        List(0,1,0),
        List(0,0,1)
      )
    val empty = List()

    val fruit1 = "apples" :: ("oranges" :: ("pears" :: Nil))
    val nums1 = 1 :: 2 :: 3 :: 4 :: Nil
    val diag31 = (1 :: 0 :: 0 :: Nil) ::
      (0 :: 1 :: 0 :: Nil) ::
      (0 :: 0 :: 1 :: Nil) :: Nil
    val empty1 = Nil

    diag3.foreach(println)

    println(empty.isEmpty)
    println(fruit.isEmpty)
    println(fruit.head)
    println(fruit.tail.head)
    println(diag3.head)

    def isort(xs: List[Int]): List[Int] = {
      if (xs.isEmpty) Nil
      else insert(xs.head, isort(xs.tail))
    }

    def insert(x: Int, xs: List[Int]): List[Int] = {
      if (xs.isEmpty || x <= xs.head) x :: xs
      else xs.head :: insert(x, xs.tail)
    }

    val List(a,b,c) = fruit
    println(a)
    println(b)
    println(c)

    val d :: e :: rest = fruit
    println(d)
    println(e)
    println(rest)

    def isort1(xs: List[Int]): List[Int] = xs match {
      case List() => List()
      case x :: xs1 => insert1(x, isort1(xs1))
    }

    def insert1(x: Int, xs: List[Int]): List[Int] = xs match {
      case List() => List(x)
      case y :: ys => if (x <= y) x :: xs
                      else y :: insert1(x, ys)
    }

    println(isort1(List(3,4,6,7,2,3,8,9,13,53,56,45,25)))

    println(List(1,2) ::: List(3,4,5))
    println(List() ::: List(1,2,3))
    println(List(1,2,3) ::: List(4))

    def append[T](xs: List[T], ys: List[T]): List[T] = xs match {
      case List() => ys
      case x :: xs1 => x :: append(xs1, ys)
    }

    println(List(1,2,3).length)

    val abcde = List('a','b','c','d','e')
    println(abcde.last)
    println(abcde.init)

    println(abcde.reverse)

    def rev[T](xs: List[T]): List[T] = xs match {
      case List() => xs
      case x :: xs1 => rev(xs1) ::: List(x)
    }

    println(rev(abcde))

    println(abcde take 2)
    println(abcde drop 2)
    println(abcde splitAt 2)

    for (i <- 1 to 10)
      println(abcde apply 2)

    println(abcde.indices)

    println(abcde.indices zip abcde)

    println(abcde zip List(1,2,3))

    println(abcde.zipWithIndex)

    println(abcde.toString)

    println(abcde mkString ("[",",","]"))
    println(abcde mkString "")
    println(abcde.mkString)
    println(abcde mkString ("List(",",",")"))

    val buf = new StringBuilder

    println(abcde addString (buf, "(", ";", ")"))

    println(buf)

    val arr = abcde.toArray

    println(arr.toString)

    println(arr.toList)

    val arr2 = new Array[Int](10)

    List(1,2,3) copyToArray (arr2, 3)

    arr2.foreach(println)

    val it = abcde.iterator

    println(it.next)

    println(it.next)

    def msort[T](less: (T,T) => Boolean)
                (xs: List[T]): List[T] = {
      def merge(xs: List[T], ys: List[T]): List[T] = (xs, ys) match {
        case (Nil, _) => ys
        case (_, Nil) => xs
        case (x :: xs1, y :: ys1) =>
          if (less(x,y)) x :: merge(xs1, ys)
          else y :: merge(xs, ys1)
      }

      val n = xs.length / 2
      if (n == 0) xs
      else {
        val (ys, zs) = xs splitAt n
        merge(msort(less)(ys), msort(less)(zs))
      }
    }

    println(msort((x: Int,y: Int) => x < y)(List(5,7,1,3)))


    val intSort = msort((x: Int, y: Int) => x < y)_
    println(intSort)

    val reverseIntSort = msort((x: Int, y: Int) => x > y)_

    val mixedInts = List(4,1,9,0,5,8,3,6,2,7)

    println(intSort(mixedInts))
    println(reverseIntSort(mixedInts))


  }

}
