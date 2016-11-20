package org.stairwaybook.recipe

/**
  * Created by FRESHIELD on 2016/11/19.
  */
abstract class Browser {
  val database: Database

  def recipesUsing(food: Food) = {
    database.allRecipes.filter(recipe =>
    recipe.ingredients.contains(food))
  }

  def displayCategory(category: database.FoodCategory): Unit = {
    println(category)
  }
}
