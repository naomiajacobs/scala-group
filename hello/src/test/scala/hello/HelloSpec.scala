package hello

import org.scalatest.FunSuite

class HelloSpec extends FunSuite {
  test("2 values are the same") {
    assert(2 === 2)
  }

  test("2 values are different") {
    assert(2 !== 3)
  }
}
