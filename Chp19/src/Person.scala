/**
  * Created by FRESHIELD on 2016/10/17.
  */
class Person (val firstName: String, val lastName: String) extends Ordered[Person]{

  def compare(that: Person) = {
    val lastNameComparison = lastName.compareToIgnoreCase(that.lastName)
    if (lastNameComparison != 0)
      lastNameComparison
    else
      firstName.compareToIgnoreCase(that.firstName)
  }

  override def toString = firstName + " " + lastName



}
