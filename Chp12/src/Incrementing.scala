/**
  * Created by FRESHIELD on 2016/10/5.
  */
trait Incrementing extends IntQueue{

  abstract override def put(x: Int){super.put(x + 1)}


}
