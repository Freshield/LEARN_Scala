/**
  * Created by FRESHIELD on 2016/10/17.
  */
class Publication (val title: String)
class Book(title: String) extends Publication(title)

object Library {
  val books: Set[Book] =
    Set (
      new Book("Programming in Scala"),
      new Book("Walden")
    )

  def printBookList(info: Book => AnyRef): Unit = {
    for (book <- books) println(info(book))
  }
}

object Customer {
  def getTitle(p: Publication): String = p.title

  def main(args: Array[String]) {
    Library.printBookList(getTitle)
  }
}
