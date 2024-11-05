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
      xs.foreach(print)
        println();
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

    def main(args: Array[String]): Unit = {
        // Test dla obetnijKrance
        val list1 = List(1, 2, 3, 4, 5)
        println("Lista dla obetnijKrance:")
        wypiszListe(list1)
        val obcieta = obetnijKrance(list1)
        println("Lista po obecieciu krancow:")
        wypiszListe(obcieta)
        println()

        // Test dla grupuj
        val list2 = List("1", "1", "1", "2", "3", "3", "4", "4", "4", "4")
        println("Lista dla grupuj:")
        wypiszListe(list2)
        val grupowana = grupuj(list2)
        println("Lista po grupuj:")
        wypiszListe(grupowana)
        println()

        // Test dla unique
        val list3 = List("1", "1", "a", "1", "1", "2", "3", "3", "1", "1", "4", "4")
        println("Lista dla unique:")
        wypiszListe(list3)
        val uniqueElems = unique(list3)
        println("Unique elements:")
        wypiszListe(uniqueElems)
        println()
    }
}
