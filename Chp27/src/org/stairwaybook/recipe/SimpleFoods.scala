package org.stairwaybook.recipe

/**
  * Created by FRESHIELD on 2016/11/19.
  */
trait SimpleFoods {
  object Pear extends Food("Pear")
  def allFoods = List(Apple, Pear)
  def allCategories = Nil

}
