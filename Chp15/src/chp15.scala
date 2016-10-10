

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
