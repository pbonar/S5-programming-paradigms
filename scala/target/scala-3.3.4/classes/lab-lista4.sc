object List4 {
  def podzielNieogonowa[A](xs: List[A]): (List[A], List[A]) = {
    xs match {
      case Nil => (Nil, Nil)
      case head :: tail =>
        val (even, odd) = podzielNieogonowa(tail)
        if (even.size == odd.size) (head :: even, odd)
        else (even, head :: odd)
    }
  }

  def polaczNieogonowa(xs: List[Int], ys: List[Int]): List[Int] = {
    (xs, ys) match {
      case (Nil, Nil) => Nil
      case (Nil, headY :: tailY) =>
        headY :: polaczNieogonowa(Nil, tailY)
      case (headX :: tailX, Nil) =>
        headX :: polaczNieogonowa(tailX, Nil)
      case (headX :: tailX, headY :: tailY) =>
        (headX + headY) :: polaczNieogonowa(tailX, tailY)
    }
  }

  def podzielOgonowa[A](xs: List[A]): (List[A], List[A]) = {
    @annotation.tailrec
    def podzielRec(xs: List[A], evenAcc: List[A], oddAcc: List[A], index: Int): (List[A], List[A]) = {
      xs match {
        case Nil => (evenAcc.reverse, oddAcc.reverse)
        case head :: tail =>
          if (index % 2 == 0)
            podzielRec(tail, head :: evenAcc, oddAcc, index + 1)
          else
            podzielRec(tail, evenAcc, head :: oddAcc, index + 1)
      }
    }

    podzielRec(xs, Nil, Nil, 0)
  }

  def main(args: Array[String]): Unit = {
    val list1 = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println("Zadanie 1")
    println(s"Lista poczatkowa 1: ($list1)")

    // ZADANIE 1
    // Test dla wersji nieogonowej
    val (even1, odd1) = podzielNieogonowa(list1)
    println(s"Wynik nieogonowy: ($even1, $odd1)")

    // Test dla wersji ogonowej
    val (even2, odd2) = podzielOgonowa(list1)
    println(s"Wynik ogonowy: ($even2, $odd2)")

    // ZADANIE 2
    // Test dla wersji ogonowej
    println("\nZadanie 2")
    val list2 = List(9, 8, 7, 6, 5, 4, 3, 2)
    println(s"Lista poczatkowa 1: ($list1)")
    println(s"Lista poczatkowa 2: ($list2)")
    val result1 = podzielOgonowa(list1, list2)
    println(s"Wynik nieogonowy: $result1")
    val result2 = podzielOgonowa(list1, list2)
    println(s"Wynik ogonowy: $result2")
  }
}

List4.main(Array())