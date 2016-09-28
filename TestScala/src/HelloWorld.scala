/**
  * Created by FRESHIELD on 2016/9/29.
  */
object HelloWorld {

  def main(args: Array[String]) {
    println("hello world")
    println(1+2)

    val msg = "hello, world"
    println(msg)

    val msg2: java.lang.String = "hello~world"
    println(msg2)

    val msg3: String = "hello again"
    println(msg3)

    var greeting = "hello world"
    println(greeting)
    greeting = "leave me alone, world"
    println(greeting)

    val multiLine =
      "this is the next line"
    println(multiLine)

    println(max(1,2))

    greet()

    var i = 0
    while(i < args.length){
      println(args(i))
      i += 1
    }

    i = 0
    while (i < args.length){
      if (i != 0)
        print(" ")
      print(args(i))
      i += 1
    }
    println()

    i = 0
    while (i < args.length){
      if (i != 0){
        print(" ")
      }
      print(args(i))
      i += 1
    }
    println()

    args.foreach(arg => println(arg))

    args.foreach((arg: String) => println(arg))

    args.foreach(println)

    for (arg <- args){
      println(arg)
    }

  }

  def max(x: Int, y: Int): Int = {
    if (x > y) x
    else y
  }

  def greet() = {
    println("hello world")
  }
}
