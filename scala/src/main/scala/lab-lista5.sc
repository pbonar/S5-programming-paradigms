object List5 {
  // Zadanie 1
  def odwroc[A](xs: List[A]): List[A] = {
    xs match {
      case Nil => Nil
      case head :: tail => odwroc(tail) ++ List(head)
    }
  }

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)
    println(odwroc(list))
    val list2 = List(2,4,6,8,0)
    println(odwroc(list2))
    val list3 = List()
    println(odwroc(list3))
  }
}
