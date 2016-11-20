package org.stairwaybook.recipe

/**
  * Created by FRESHIELD on 2016/11/19.
  */
abstract class Database extends FoodCategories{
  def allFoods: List[Food]
  def allRecipes: List[Recipe]

  def foodNamed(name: String) = {
    allFoods.find(f => f.name == name)
  }

}
