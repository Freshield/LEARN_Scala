

/**
  * Created by FRESHIELD on 2016/10/7.
  */
class Outer {
  class Inner{
    private def f(){println("f")}
    class InnerMost{
      f()
    }
  }



}
