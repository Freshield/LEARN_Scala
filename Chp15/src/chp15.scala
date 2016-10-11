

/**
  * Created by FRESHIELD on 2016/10/9.
  */
import Math.{E, PI}

object chp15 {

  def main(args: Array[String]): Unit = {
    println(10)
    val v = Var("x")
    println(v)
    val op = BinOp("+", Number(1), v)
    println(op)
    println(v.name)
    println(op.left)
    println(op.right == Var("x"))

    val uo = UnOp("-",UnOp("-",Number(1)))
    println(uo)

    println(simplifyTop(UnOp("-", UnOp("-",Var("x")))))
    println(simplifyTop(BinOp("*", Var("x"), Number(1))))
    println(simplifyTop(BinOp("x", Var("x"), Number(0))))

    checkBinary1(BinOp("x", Var("x"), Number(0)))
    checkBinary2(BinOp("x", Var("x"), Number(0)))
    checkBinary2(Var("x"))

    println()
    println(describe(5))
    println(describe(true))
    println(describe("hello"))
    println(describe(Nil))
    println(describe(List(1,2,3)))

    println(startWithZero(0))
    println(startWithZero("x"))

    println(testEPI)

    println(testLittlePI)

    deepMatch(BinOp("+", Var("x"), Number(0)))
    deepMatch(BinOp("x", Var("x"), Number(0)))

    sequenceMatch(List(0, 1, 2))
    sequenceMatch(List(2,3,4))
    sequenceMatch(List(0,1,2,3))

    mutableSequenceMatch(List(0,1,2))
    mutableSequenceMatch(List(0,1,2,3))

    try5SequenceMatch(List(0,4,4,4,4))
    try5SequenceMatch(List(0,1,2,3,4))
    try5SequenceMatch(List(0,1,4))

    tupleDemo("a ", 3, "-tuple")

    println(generalSize("abc"))
    println(generalSize(Map(1 -> 'a', 2 -> 'b')))
    println(generalSize(Math.PI))

    println(isIntIntMap(Map(1 -> 1)))
    println(isIntIntMap(Map("abc" -> "bcd")))

    println(isStringArray(Array("abc")))
    println(isStringArray(Array(1,2,3)))

    println(boundMatch(UnOp("abs", UnOp("abs", Var("x")))))

    println(simplifyAdd(BinOp("+", Var("1"), Var("1"))))

    println(simplifyAll(UnOp("-", UnOp("-",Var("x")))))
    println(simplifyAll(BinOp("*", Var("x"), Number(1))))
    println(simplifyAll(BinOp("x", Var("x"), Number(0))))

    println(describeMatch(Var("x")))
  }

  def describeMatch(expr: Expr) = (expr: @unchecked) match {
    case Number(_) => "a number"
    case Var(_) => "a variable"
  }

  def simplifyAll(expr: Expr): Expr = expr match {
    case UnOp("-", UnOp("-",e)) => simplifyAll(e)
    case BinOp("+", e, Number(0)) => simplifyAll(e)
    case BinOp("*", e, Number(1)) => simplifyAll(e)
    case UnOp(op, e) => UnOp(op, simplifyAll(e))
    case BinOp(op, l, r) => BinOp(op, simplifyAll(l), simplifyAll(r))
    case _ => expr
  }

  def simplifyAdd(expr: Expr) = expr match {
    case BinOp("+", x, y) if x == y => BinOp("*", x, Number(2))
    case _ => expr
  }

  def boundMatch(expr: Expr) = expr match {
    case UnOp("abs", e @ UnOp("abs", _)) => e
    case _ =>
  }

  def isStringArray(x: Any) = x match {
    case a: Array[String] => "yes"
    case _ => "no"
  }

  def isIntIntMap(x: Any) = x match {
    case m: Map[Int, Int] => true
    case _ => false
  }

  def generalSize(x: Any) = x match {
    case s: String => s.length
    case m: Map[_, _] => m.size
    case _ => 1
  }

  def tupleDemo(expr: Any) = expr match {
    case (a,b,c) => println("matched " + a + b + c)
    case _ => println("other")
  }

  def try5SequenceMatch(expr: List[Int]) = expr match {
    case List(0, _3, 4) => println("found it")
    case _ => println("other")
  }

  def mutableSequenceMatch(expr: List[Int]) = expr match {
    case List(0, _*) => println("found it")
    case _ => println("other")
  }

  def sequenceMatch(expr: List[Int]) = expr match {
    case List(0, _, _) => println("found it")
    case _ => println("other")
  }

  def deepMatch(expr: Expr) = expr match{
    case BinOp("+", e, Number(0)) => println(e + " a deep match")
    case _ => println("other")
  }

  def testLittlePI() = {
    val pi = PI
    E match {
      case `pi` => "strange math? PI = " + PI
      case _ => "OK"
    }
  }

  def testEPI() = E match {
    case PI => "strange math? PI = " + PI
    case _ => "OK"
  }

  def startWithZero(x: Any) = x match {
    case 0 => "zero"
    case somethingElse => "not zero: " + somethingElse
  }

  def describe(x: Any) = x match {
    case 5 => "five"
    case true => "truth"
    case "hello" => "hi!"
    case Nil => "the empty list"
    case _ => "something else"
  }

  def simplifyTop(expr: Expr): Expr = expr match{
    case UnOp("-", UnOp("-",e)) => e
    case BinOp("+", e, Number(0)) => e
    case BinOp("*", w, Number(1)) => w
    case _ => expr
  }




  def checkBinary1(expr: Expr): Unit ={
    expr match {
      case BinOp(op, left, right) => println(expr + " is a binary operation")
      case _ =>
    }
  }

  def checkBinary2(expr: Expr): Unit ={
    expr match {
      case BinOp(_, _, _) => println(expr + " is a binary operation")
      case _ => println("It's something else")
    }
  }
}
