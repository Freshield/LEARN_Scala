/**
  * Created by FRESHIELD on 2016/10/5.
  */
object chp12 {

  def main(args: Array[String]) {

    val frog = new Frog
    println(frog)
    frog.philosophize()

    val phil: Philosophical = frog
    phil.philosophize()


    val rect = new Rectangle(new Point(1,1),new Point(10,10))

    println(rect.left)

    println(rect.right)

    println(rect.width)


    val half = new Rathional(1,2)
    val third = new Rathional(1,3)
    println(half < third)
    println(half > third)
    println(half <= third)

    val queue = new BasicIntQueue
    queue.put(10)
    queue.put(20)

    println(queue.get)
    println(queue get)

    val queue1 = new MyQueue

    queue1.put(10)
    println(queue1.get())

    val queue2 = new BasicIntQueue with Doubling
    queue2.put(20)
    println(queue2.get())

    val queue3 = new BasicIntQueue with Incrementing with Filtering
    queue3.put(-1)
    queue3.put(0)
    queue3.put(1)

    println(queue3.get())
    println(queue3.get())

    val queue4 = new BasicIntQueue with Filtering with Incrementing
    queue4.put(-1)
    queue4.put(0)
    queue4.put(1)

    println(queue4.get())
    println(queue4.get())
    println(queue4.get())

    val queue5 = new BasicIntQueue with Incrementing with Doubling

    queue5.put(10)
    println(queue5.get())
    queue5.test



  }

}
