import java.io.File

import scala.io.StdIn
import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException
import java.net.URL
import java.net.MalformedURLException
/**
  * Created by FRESHIELD on 2016/10/2.
  */
object chp7 {

  def main(args: Array[String]) {
    val filename =
      if (!args.isEmpty) args(0)
      else "default.txt"

    println(filename)

    def gcdLoop(x: Long, y: Long): Long = {
      var a = x
      var b = y
      while (a != 0){
        val temp = a
        a = b % a
        b = temp
      }
      b
    }
/*
    var line = ""
    do{
      line = StdIn.readLine()
      println("read: " + line)
    }while(line != "")
*/
    def greet() {println("hi")}
    def greet1() = println("hello")
    println(greet == greet1)
/*
    var line = ""
    while ((line = StdIn.readLine()) != "")
      println("read: " + line)
*/
    def printReadline(): Boolean = {
      val temp = StdIn.readLine()
      println("read: " + temp)
      if (temp == "") true
      else printReadline()
    }

    //printReadline()

    val fileHere = (new File(".")).listFiles

    for (file <- fileHere)
      println(file)

    for (i <- 1 to 4)
      println("Iteration " + i)

    for (i <- 1 until 4)
      println("Iteration " + i)

    for (file <- fileHere if file.getName.endsWith(".iml"))
      println(file)

    for (
      file <- fileHere
      if file.isFile;
      if file.getName.endsWith("iml")
    ) println(fileLines(file))

    def fileLines(file: java.io.File) =
      scala.io.Source.fromFile(file).getLines.toList

    def grep(pattern: String):String = {
      var test = ""
      for {
        file <- fileHere
        if file.getName.endsWith("iml")
        line <- fileLines(file)
        trimmed = line.trim
        if trimmed.matches(pattern)
      } test = file + "" + trimmed
      test
    }

    println(grep(".*xml.*"))

    println(grep("asdf") == ())

    def imlFiles = {
      for (
        file <- fileHere
        if file.getName.endsWith("iml")
      ) yield {file}
    }

    println(imlFiles.getClass)

    for (file <- imlFiles)
      println(file)

    val forLineLengths =
      for {
        file <- fileHere
        if file.getName.endsWith("iml")
        line <- fileLines(file)
        trimmed = line.trim
        if trimmed.matches(".*type.*")
      } yield trimmed.length

    println(forLineLengths.getClass)

    for (number <- forLineLengths)
      println(number)

    val nn = 2

    val half =
      if (nn % 2 == 0)
        nn / 2
      else
        throw new RuntimeException("n must be even")

    println(half)

    try {
      val f = new FileReader("input.txt")
    } catch {
      case ex: FileNotFoundException => println("file not found")
      case ex: IOException => println("other problem")
    } finally {
      println("done")
    }

    def urlFor(path: String) =
      try{
        new URL(path)
      } catch {
        case e: MalformedURLException =>
          new URL("http://www.scala-lang.org")
      }

    println(urlFor("http://www.baidu.com"))

    def f(): Int = try {return 1} finally {return 2}
    def g(): Int = try { 1} finally { println("here"); 2}
    println(f())
    println(g())

    val firstArg = if (args.length > 0) args(0) else ""

    val friend =
      firstArg match {
        case "salt" => "pepper"
        case "chips" => "salsa"
        case "eggs" => "bacon"
        case _ => "huh?"
      }
    println(friend)

    var ii = 0
    var foundIt = false

    while (ii < args.length && !foundIt){
      if (!args(ii).startsWith("-")){
        if (args(ii).endsWith(".iml"))
          foundIt = true
      }
      ii += 1
    }

    def searchFrom(i: Int): Int =
      if (i >= args.length) -1
      else if (args(i).startsWith("-")) searchFrom(i + 1)
      else if (args(i).endsWith(".iml")) i
      else searchFrom(i + 1)

    val i = searchFrom(0)
    println(i)

    def printMultiTable(): Unit ={
      var i = 1
      while (i <= 10){
        var j = 1
        while (j <= 10){
          val prod = (i * j).toString
          var k = prod.length
          while (k < 4){
            print(" ")
            k += 1
          }

          print(prod)
          j += 1
        }

        println()
        i += 1
      }
    }

    printMultiTable()

    val a = 1;
    {
      val a = 2;
      println(a)
    }
    println(a)

    def makeRowSeq(row: Int) =
      for (col <- 1 to 10) yield {
        val prod = (row * col).toString
        val padding = " " * (4 - prod.length)
        padding + prod
      }

    def makeRow(row: Int) = makeRowSeq(row).mkString

    def multiTable() = {
      val tableSeq =
        for (row <- 1 to 10)
          yield makeRow(row)

      tableSeq.mkString("\n")
    }

    println(multiTable)
  }

}
