/**
  * Created by FRESHIELD on 2016/10/5.
  */
trait Doubling extends IntQueue{

  abstract override def put(x: Int){super.put(2 * x)}

  def test = println("doubling")

}
