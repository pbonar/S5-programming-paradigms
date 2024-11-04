object lab1 {
  // ZADANIE 1
  def srednia(a: Float, b: Float, c: Float): Float = {
    (a+b+c)/3
  }

  def main(args: Array[String]): Unit = {
    println("\nSrednia")
    println("a=3, b=4, c=2, srednia=" + {srednia(3, 4, 2)})
    println("a=5, b=1, c=0, srednia=" + {srednia(5, 1, 0)})
    println("a=3, b=3, c=3, srednia=" + {srednia(3, 3, 3)})
    println("a=1, b=4, c=2, srednia=" + {srednia(1, 4, 2)})
    println("a=3, b=1, c=2, srednia=" + {srednia(3, 1, 2)})
  }

}