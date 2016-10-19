/**
  * Created by FRESHIELD on 2016/10/19.
  */
class Grass extends Food

class Cow extends Animal{
  type SuitableFood = Grass
  override def eat(food: Grass){println("cow")}
}
