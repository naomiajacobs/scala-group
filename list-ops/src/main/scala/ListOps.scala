package ListOps

object ListOps {
  def count(list: List[Any]): Int = {
    list.isEmpty match {
      case true => 0
      case false => 1 + count(list.drop(1))
    }
  }
}
