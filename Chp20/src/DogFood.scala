/**
  * Created by FRESHIELD on 2016/10/19.
  */
class DogFood extends Food

class Dog extends Animal{
  type SuitableFood = DogFood
  override def eat(food: DogFood){println("dog")}
}
