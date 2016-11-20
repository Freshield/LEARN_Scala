package org.stairwaybook.recipe

/**
  * Created by FRESHIELD on 2016/11/19.
  */
object Apple extends Food("Apple")
object Orange extends Food("Orange")
object Cream extends Food("Cream")
object Sugar extends Food("Suger")


object FruitSalad extends Recipe(
  "fruit salad",
  List(Apple, Orange, Cream, Sugar),
  "Stir it all together"
){



}
