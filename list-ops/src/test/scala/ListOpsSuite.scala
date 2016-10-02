package ListOps

import org.scalatest.FunSuite

class ListOpsSuite extends FunSuite {
  test("an empty list") {
    val list = List.empty[Int]
    assert(ListOps.count(list) === 0)
  }

  test("a list with one element") {
    val list = List(1)
    assert(ListOps.count(list) === 1)
  }

  test("a list with several elements") {
    val list = List(1, 2, 3, 4, 5)
    assert(ListOps.count(list) === 5)
  }

  test("a list with many elements") {
    val list = List.range(0, 256)
    assert(ListOps.count(list) === 256)
  }
}
