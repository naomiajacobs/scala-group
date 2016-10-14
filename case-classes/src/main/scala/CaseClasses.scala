package CaseClasses

case class Location(city: String, country: String)
case class Person(name: String, location: Location)

object CaseClasses {
  def extract_name(peep: Person): String = peep match{
    case Person(name, _) => name
  }

  def is_from_country(country: String)(peep: Person): Boolean = peep match {
    case Person(_, Location(_, `country`)) => true
    case _ => false
  }

  def is_canadian(peep: Person): Boolean = {
    return is_from_country("Canada")(peep);
  }

  def filter(people: List[Person], test: Person => Boolean): List[Person] = people match {
    case head :: tail if test(head) => head :: filter(tail, test)
    case head :: tail => filter(tail, test)
    case _ => Nil
  }

  def names_from(people: List[Person], country: String): List[String] = {
    filter(people, is_from_country("USA")).map(_.name)
  }
}
