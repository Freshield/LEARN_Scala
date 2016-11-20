package org.stairwaybook.recipe

/**
  * Created by FRESHIELD on 2016/11/19.
  */
trait FoodCategories {
  case class FoodCategory(name: String, foods: List[Food])
  def allCategories: List[FoodCategory]

}
