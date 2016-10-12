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



  }

}
