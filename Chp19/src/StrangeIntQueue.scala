/**
  * Created by FRESHIELD on 2016/10/17.
  */
class StrangeIntQueue extends Queue[Int]{

  override def append(x: Int) = {
    println(Math.sqrt(x))
    super.append(x)
  }

}
