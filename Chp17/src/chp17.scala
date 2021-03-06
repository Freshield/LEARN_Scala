/**
  * Created by FRESHIELD on 2016/10/14.
  */
import scala.collection.mutable.ListBuffer
import scala.collection.mutable.ArrayBuffer
import scala.collection.immutable.{Queue, TreeMap}
import scala.collection.mutable
import scala.collection.mutable.Stack

object chp17 {

  def main(args: Array[String]) {
    val colors = List("red","blue","green")
    println(colors.head)
    println(colors.tail)
    colors.foreach(println)

    val fiveInts = new Array[Int](5)
    println(fiveInts.mkString(" "))
    val fiveToOne = Array(5,4,3,2,1)
    println(fiveToOne.mkString(" "))

    fiveInts(0) = fiveToOne(4)
    println(fiveInts.mkString(" "))

    val buf = new ListBuffer[Int]
    println(buf)
    println(buf += 1)
    println(buf += 2)
    println(buf)
    println(3 +: buf)
    println(buf.toList)

    val buf1 = new ArrayBuffer[Int]()
    println(buf1)
    println(buf1 += 12)
    println(buf1 += 15)
    println(buf1)
    println(buf1.length)
    println(buf1(0))

    val empty1 = Queue[Int]()
    println(empty1)
    val has1 = empty1.enqueue(1)
    println(has1)
    val has123 = has1.enqueue(List(2,3))
    println(has123)
    val (element, has23) = has123.dequeue
    println(element)
    println(has23)

    val queue = new scala.collection.mutable.Queue[String]
    println(queue)
    println(queue += "a")
    println(queue ++= List("b","c"))
    println(queue)
    println(queue.dequeue)
    println(queue)

    val stack = new Stack[Int]
    println(stack.push(1))
    println(stack.push(2))
    println(stack.pop)
    println(stack.pop())
    println(stack)

    def hasUpperCase(s: String) = s.exists(_.isUpper)
    println(hasUpperCase("Robert Frost"))
    println(hasUpperCase("e e cummings"))


    val mutaSet = scala.collection.mutable.Set(1,2,3)
    println(mutaSet)

    val text = "See Spot run. Run, Spot. Run!"

    val wordsArray = text.split("[ !,.]+")
    println(wordsArray.mkString(" "))
    println(wordsArray.length)

    val words = mutable.Set.empty[String]
    for (word <- wordsArray)
      words += word.toLowerCase

    println(words)

    val nums = Set(1,2,3)
    println(nums)
    println(nums + 5)
    println(nums - 3)
    println(nums ++ List(5,6))
    println(nums -- List(1,2))

    println(nums & Set(1,3,5,7))
    println(nums.size)
    println(nums.contains(3))

    val words1 = scala.collection.mutable.Set.empty[String]
    println(words1 += "the")
    println(words1)
    println(words1 -= "the")
    println(words1 ++= List("do","re","mi"))
    println(words1 --= List("do","re"))
    println(words1.clear())
    println(words1)

    val map = scala.collection.mutable.Map.empty[String, Int]
    println(map("hello") = 1)
    println(map("there") = 2)
    println(map)
    println(map("hello"))

    def countWords(text: String) = {
      val counts = mutable.Map.empty[String, Int]
      for (rawWord <- text.split("[ ,!.]+")) {
        val word = rawWord.toLowerCase
        val oldCount =
          if (counts.contains(word)) counts(word)
          else 0
        counts += (word -> (oldCount + 1))
      }
      counts
    }

    println(countWords(text))


    val test1 = mutable.Map.empty[String, Int]
    test1("hello") = 1
    println(test1)
    test1("hello") = 2
    println(test1)

    val nums1 = Map("i" -> 1, "ii" -> 2)
    println(nums1 + ("vi" -> 6))
    println(nums1 - "ii")
    println(nums1 ++ List("iii" -> 3, "v" -> 5))
    println(nums1 -- List("i","ii"))
    println(nums1.size)
    println(nums1.contains("ii"))
    println(nums1.keys)
    println(nums1.keySet)
    println(nums1.values)
    println(nums1.isEmpty)

    val words2 = scala.collection.mutable.Map.empty[String, Int]
    println(words2 += ("one" -> 1))
    println(words2)
    println(words2 -= ("one"))
    println(words2 ++= List("one" -> 1, "two" -> 2, "three" -> 3))
    println(words2 --= List("one","two"))

    val test2 = Set(1,2,3,4,5,6,7,8,9,10)
    println(test2)
    println(test2 + 22)
    println(test2.getClass)
    val test22 = test2 -- List(1,2,3,4,5,6,7,8)
    println(test22)
    println(test22.getClass)
    val test222 = Set(1,2,3)
    println(test222.getClass)
    val test2222 = test222 + 233
    println(test2222)
    println(test2222.getClass)

    val ts = scala.collection.immutable.TreeSet(9,3,1,8,0,2,7,4,6,5)
    println(ts)
    val cs = mutable.TreeSet('f','u','n')
    println(cs)
    var tm = scala.collection.immutable.TreeMap(3 -> 'x', 1 -> 'x', 4 -> 'x')
    println(tm)
    println(tm += (2 -> 'x'))
    println(tm)

    val capital = MapMaker.makeMap
    println(capital ++= List("US" -> "Washington","Paris" -> "France", "Japan" -> "Tokyo"))
    println(capital)
    println(capital("Japan"))
    println(capital("New Zealand"))
    println(capital += ("New Zealand" -> "Wellington"))
    println(capital("New Zealand"))

    var people = Set("Nancy", "Jane")
    println(people)
    println(people += "Bob")
    println(people)
    people -= "Jane"
    println(people)
    people ++= List("Tom", "Harry")
    println(people)

    var capital1 = Map("US" -> "Washington","Paris" -> "France")
    capital1 += ("Japan" -> "Tokyo")
    println(capital)

    var roughlyPi = 3.0
    println(roughlyPi)
    roughlyPi += 0.1
    println(roughlyPi)
    roughlyPi += 0.04
    println(roughlyPi)


    println(List(1,2,3))
    println(Set('a','b','c'))
    println(scala.collection.mutable.Map("hi" -> 2, "there" -> 3))
    println(Array(1.0,2.0,3).mkString(" "))

    val stuff = mutable.Set[Any](42)
    println(stuff)
    println(stuff.getClass)
    stuff += "abracadabra"
    println(stuff)
    println(stuff.getClass)


    val colors1 = List("blue","yellow","red","green")
    val treeSet1 = scala.collection.immutable.TreeSet[String]() ++ colors1
    println(treeSet1)

    println(treeSet1.toList)
    println(treeSet1.toArray)

    val mutaSet2 = mutable.Set.empty ++ treeSet1
    println(mutaSet2)
    println(mutaSet2.getClass)
    val immutaSet2 = Set.empty ++ mutaSet2
    println(immutaSet2)
    println(immutaSet2.getClass)

    val muta = mutable.Map("i" -> 1, "ii" -> 2)
    println(muta)
    println(muta.getClass)
    val immuta = Map.empty ++ muta
    println(immuta)
    println(immuta.getClass)

    println((1,"hello",'x').getClass)

    def longestWord(words: Array[String]) = {
      var word = words(0)
      var idx = 0
      for (i <- 1 until words.length)
        if (words(i).length > word.length){
          word = words(i)
          idx = i
        }
      (word,idx)
    }

    val longest = longestWord("The quick brown fox".split(" "))
    println(longest)
    println(longest._1)
    println(longest._2)

    val (word, idx) = longest
    println(word)
    println(idx)

    val word1, idx1 = longest
    println(word1)
    println(idx1)




  }

}
