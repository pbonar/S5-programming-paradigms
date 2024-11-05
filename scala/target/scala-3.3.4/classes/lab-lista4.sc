object Lista4 {
  def podzielNieogonowa[A](xs: List[A]): (List[A], List[A]) = {
    xs match {
      case Nil => (Nil, Nil)
      case head :: tail =>
        val (even, odd) = podzielNieogonowa(tail)
        if (even.length % 2 == 0) (head :: even, odd) // Dodaj do podlisty parzystej
        else (even, head :: odd) // Dodaj do podlisty nieparzystej
    }
  }

  def main(args: Array[String]) : Unit = {
    podzielNieogonowa(List(1,2,3,4,5,6,7,8,9))
  }
}
