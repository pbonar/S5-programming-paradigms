import scala.collection.immutable

object List3 {
    // Zadanie 1
    def obetnijKranceRec[A](xs: List[A]): List[A] = {
        if (xs.isEmpty || xs.tail.isEmpty)
            Nil
        else 
            xs.head :: obetnijKranceRec(xs.tail)
    }

    def obetnijKrance[A](xs: List[A]): List[A] = {
        if (xs.isEmpty || xs.tail.isEmpty) Nil
        else obetnijKranceRec(xs.tail)
    }

    def wypiszListe[A](xs: List[A]) = {
      xs.foreach(println)
    }

    // Zadanie 2
    def grupuj[A](xs: List[A]): List[(A, Int)] = {
        @annotation.tailrec
        def grupujRec(xs: List[A], x: A, count: Int, acc: List[(A, Int)]): List[(A, Int)] = {
            xs match {
                case Nil => acc :+ (x, count)
                case head :: tail =>
                    if (head == x) {
                        grupujRec(tail, x, count + 1, acc)
                    } else {
                        grupujRec(tail, head, 1, acc :+ (x, count))
                    }
            }
        }

        xs match {
            case Nil => Nil
            case head :: tail => grupujRec(tail, head, 1, Nil)
        }
    }

    // Zadanie 3
    def unique[A](xs: List[A]): List[A] = {
        val xsUn = grupuj(xs)

        @annotation.tailrec
        def znajdzUnique(xs: List[(A, Int)], acc: List[A]): List[A] = {
            xs match {
                case Nil => acc.reverse
                case (elem, 1) :: tail => znajdzUnique(tail, elem :: acc)
                case _ :: tail => znajdzUnique(tail, acc)
            }
        }

        znajdzUnique(xsUn, Nil)
    }

}
