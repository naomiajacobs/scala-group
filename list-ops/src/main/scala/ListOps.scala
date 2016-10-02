package ListOps

object ListOps {
  def count(list: List[Any]): Int = list match {
    case _ :: tail => 1 + count(tail)
    case Nil => 0
  }
}
