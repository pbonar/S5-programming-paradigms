object List5 {
  // Zadanie 1
  def odwroc[A](xs: List[A]): List[A] = {
    @annotation.tailrec
    def reverseHelper(xs: List[A], acc: List[A]): List[A] = {
      xs match {
        case Nil => acc
        case head :: tail => reverseHelper(tail, head :: acc)
      }
    }
    reverseHelper(xs, Nil)
  }

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)
    println(odwroc(list)) // powinno wydrukować List(4, 3, 2, 1)
  }
}
