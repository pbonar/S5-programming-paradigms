object lab1 {
  // ZADANIE 1
  def srednia(a: Float, b: Float, c: Float): Float = {
    (a+b+c)/3
  }

  // ZADANIE 2
  def dlugosc(s: String): Int = {
    if (s == "") 0
    else 1 + dlugosc(s.tail)
  }

  def polacz(xs: List[String]): List[Int] = {
    if (xs.isEmpty) then
      Nil
    else
      List(dlugosc(xs.head)) ++ polacz(xs.tail)
  }

  def main(args: Array[String]): Unit = {
    println("\nSrednia - Zadanie 1")
    println("a=3, b=4, c=2, srednia=" + {srednia(3, 4, 2)})
    println("a=5, b=1, c=0, srednia=" + {srednia(5, 1, 0)})
    println("a=3, b=3, c=3, srednia=" + {srednia(3, 3, 3)})
    println("a=1, b=4, c=2, srednia=" + {srednia(1, 4, 2)})
    println("a=3, b=1, c=2, srednia=" + {srednia(3, 1, 2)})

    println("\nPolacz - Zadanie 2")
    println(polacz(List("hello", "world", "")))
    println(polacz(List("lollo", "tutututu", "maxverstapen")))
    println(polacz(List("legitymacja", "szkolna", "pwr")))
    println(polacz(List("gruba", "penga", "hrabia")))
    println(polacz(List("kod", "posztowy", "zero")))
  }

}