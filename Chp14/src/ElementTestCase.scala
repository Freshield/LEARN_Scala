/**
  * Created by FRESHIELD on 2016/10/8.
  */
import junit.framework.TestCase
import junit.framework.Assert.assertEquals
import junit.framework.Assert.fail
import Element.elem

class ElementTestCase extends TestCase{

  def testUniformElement(): Unit ={
    val ele = elem('x',2,3)
    assertEquals(2, ele.width)
    assertEquals(3, ele.height)
    try{
      elem('x', 2, 3)
      //fail()
    }
    catch {
      case e: IllegalArgumentException => println("here")
    }
  }

}
