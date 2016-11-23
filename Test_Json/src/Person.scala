/**
  * Created by FRESHIELD on 2016/11/23.
  */
case class Child(name: String, age: Int)
case class Address(street: String, city: String)
case class Person(name: String, address: Address, children: List[Child])
