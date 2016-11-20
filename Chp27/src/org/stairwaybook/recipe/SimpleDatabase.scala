package org.stairwaybook.recipe

/**
  * Created by FRESHIELD on 2016/11/19.
  */
object SimpleDatabase extends Database
with SimpleFoods with SimpleRecipes{

}

object SimpleBrowser extends Browser{

  val database = SimpleDatabase
}