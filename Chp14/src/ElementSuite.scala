/**
  * Created by FRESHIELD on 2016/10/8.
  */
import org.scalatest.Suite
import Element.elem

class ElementSuite extends Suite{

  def testUniformElement(): Unit ={
    val ele = elem('x',2,3)
    assert(ele.width == 2)
  }

}
