package org.stairwaybook.recipe

/**
  * Created by FRESHIELD on 2016/11/19.
  */
class Recipe (
  val name: String,
  val ingredients: List[Food],
  val instructions: String
             ) {

  override def toString = name

}
