package CaseClasses

case class Location(city: String, country: String)
case class Person(name: String, location: Location)

object CaseClasses {
  def extract_name(peep: Person): String = {
    ""
  }

  def is_canadian(peep: Person): Boolean = {
    false
  }

  def names_from(people: List[Person], country: String): List[String] = {
    List.empty[String]
  }
}
