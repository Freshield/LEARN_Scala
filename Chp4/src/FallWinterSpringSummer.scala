/**
  * Created by FRESHIELD on 2016/10/1.
  */
import ChecksumAccumulatoring.calculate

object FallWinterSpringSummer extends App{

  for (season <- List("fall","winter","spring")){
    println(season + ": " + calculate(season))
  }

}
