object List1 {
  // ZADANIE 1
  def flatten[A](xss: List[List[A]]): List[A] = {
    if (xss != null && xss.nonEmpty)
      xss.head ++ flatten(xss.tail)
    else Nil
  }

  // ZADANIE 2
  def count[A](x: A, xs: List[A]): Int = {
    if (xs == null || xs.isEmpty)
      0
    else {
      val x1 = if (x == xs.head) 1 else 0
      x1 + count(x, xs.tail)
    }
  }

  // ZADANIE 3
  def replicate[A](x: A, n: Int): List[A] = {
    if (n > 0)
      List(x) ++ replicate(x, n - 1)
    else
      Nil
  }

  // ZADANIE 4
  def sqrList(xs: List[Int]): List[Int] = {
    if (xs != null && xs.nonEmpty)
      List(xs.head * xs.head) ++ sqrList(xs.tail)
    else
      Nil
  }

  // ZADANIE 5
  def palindrome[A](xs: List[A]): Boolean = {
    if (xs == null) false
    else xs == xs.reverse
  }

  // ZADANIE 6
  def listLength[A](xs: List[A]): Int = {
    if (xs != null && xs.nonEmpty)
      1 + listLength(xs.tail)
    else
      0
  }

  def main(args: Array[String]): Unit = {
    // flatten
    println("\nFlatten")
    println(flatten(List(List(5, 6), List(1, 2, 3))) == List(5, 6, 1, 2, 3))
    println(flatten(List(List("a", "o", "e"), List("i", "u"), List("y"))) == List("a", "o", "e", "i", "u", "y"))
    println(flatten(Nil) == Nil)
    println(flatten(null) == Nil)

    // count
    println("\nCount")
    println(count("a", List("a", "l", "a")) == 2)
    println(count("i", List("a", "o", "a")) == 0)
    println(count("a", List("")) == 0)
    println(count("a", Nil) == 0)
    println(count("a", null) == 0)

    // replicate
    println("\nReplicate")
    println(replicate("la", 3) == List("la", "la", "la"))
    println(replicate("a", 0) == Nil)
    println(replicate("a", -1) == Nil)
    println(replicate(null, 3) == List(null, null, null))
    println(replicate(Nil, 2) == List(List(), List()))

    // sqrList
    println("\nSqrList")
    println(sqrList(List(1, 2, 3, -4)) == List(1, 4, 9, 16))
    println(sqrList(Nil) == Nil)
    println(sqrList(null) == Nil)

    // palindrome
    println("\nPalindrome")
    println(palindrome(List("a", "l", "a")) == true)
    println(palindrome(Nil) == true)  // Pusta lista to palindrom
    println(palindrome(null) == false)

    // listLength
    println("\nListLength")
    println(listLength(List(1, 2, 3)) == 3)
    println(listLength(Nil) == 0)
    println(listLength(null) == 0)
  }
}
