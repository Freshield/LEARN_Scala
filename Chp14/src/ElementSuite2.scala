/**
  * Created by FRESHIELD on 2016/10/8.
  */
import org.scalatest.FunSuite
import Element.elem

class ElementSuite2 extends FunSuite{

  test("elem result should have passed width"){
    val ele = elem('x',2,3)
    assert(ele.width === 2)

  }

}
