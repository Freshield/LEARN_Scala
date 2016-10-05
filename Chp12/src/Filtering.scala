/**
  * Created by FRESHIELD on 2016/10/5.
  */
trait Filtering extends IntQueue{

  abstract override def put(x: Int): Unit ={
    if (x >= 0) super.put(x)
  }

}
