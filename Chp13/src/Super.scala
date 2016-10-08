/**
  * Created by FRESHIELD on 2016/10/7.
  */
package p{
  class Super {
    protected def f(){println("f")}
    def g(){println("g")}
  }
  class Sub extends Super{
    f()
  }
  class Other{
    (new Super).g()
  }
}

