package CaseClasses

import org.scalatest.FunSuite

class CaseClassesSuite extends FunSuite {
  val bob = Person("Bob", Location("San Francisco", "USA"))
  val jane = Person("Jane", Location("Toronto", "Canada"))
  val bill = Person("Bill", Location("New York", "USA"))

  test("extracting the name") {
    assert(CaseClasses.extract_name(bob) === "Bob")
    assert(CaseClasses.extract_name(jane) === "Jane")
  }

  test("determiming if someone is Canadian") {
    assert(CaseClasses.is_canadian(jane))
    assert(!CaseClasses.is_canadian(bob))
  }

  test("extracting names from a specific country") {
    val people = List(bob, jane, bill)
    val extracted_names = CaseClasses.names_from(people, "USA")
    assert(extracted_names === List("Bob", "Bill"))
  }
}
