/**
  * Created by FRESHIELD on 2016/11/19.
  */
import org.stairwaybook.recipe._

object chp27 {

  def main(args: Array[String]) {
    val apple = SimpleDatabase.foodNamed("Apple").get
    println(apple)

    val recipe = SimpleBrowser.recipesUsing(apple)
    println(recipe)
  }

}
