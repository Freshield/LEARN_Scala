package org.stairwaybook.recipe

/**
  * Created by FRESHIELD on 2016/11/19.
  */
object GotApples {

  def main(args: Array[String]) {
    val db: Database = {
      if (args(0) == "student")
        StudentDatabase
      else
        SimpleDatabase
    }

    object browser extends Browser{
      val database: db.type = db
    }

    //for (catebory <- db.allCategories)
    //  browser.displayCategory(category)

    val apple = SimpleDatabase.foodNamed("Apple").get

    for (recipe <- browser.recipesUsing(apple))
      println(recipe)

    val category = StudentDatabase.allCategories.head
    println(category)
    //SimpleBrowser.displayCategory(category)

  }

}
