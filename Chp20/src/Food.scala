/**
  * Created by FRESHIELD on 2016/10/19.
  */
class Food {

}

abstract class Animal{
  type SuitableFood <: Food
  def eat(food: SuitableFood)
}
