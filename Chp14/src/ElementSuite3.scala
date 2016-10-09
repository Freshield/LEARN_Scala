/**
  * Created by FRESHIELD on 2016/10/8.
  */
import org.scalatest.junit.JUnit3Suite
import Element.elem

class ElementSuite3 extends JUnit3Suite{

  def testUniformElement(): Unit ={
    val ele = elem('x', 2, 3)
    assert(ele.width == 2)

  }

}
