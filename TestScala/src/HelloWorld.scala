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
    
  }

  def max(x: Int, y: Int): Int = {
    if (x > y) x
    else y
  }

  def greet() = {
    println("hello world")
  }
}
