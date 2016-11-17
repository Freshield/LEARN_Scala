/**
  * Created by FRESHIELD on 2016/11/17.
  */
abstract class CCTherm {
  val description: String
  val yearMade: Int
  val dateObtained: String
  val condition: Int

  override def toString = description

  def toXML =
    <cctherm>
      <description>{description}</description>
      <yearMade>{yearMade}</yearMade>
      <dateObtained>{dateObtained}</dateObtained>
      <condition>{condition}</condition>
    </cctherm>
}
