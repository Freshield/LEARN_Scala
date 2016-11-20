package org.stairwaybook.recipe

/**
  * Created by FRESHIELD on 2016/11/19.
  */
trait SimpleRecipes {

  this: SimpleFoods =>

  object FruitSalad extends Recipe(
    "fruit salad",
    List(Apple, Pear),
    "Mix it all together"
  )
  def allRecipes = List(FruitSalad)

}
