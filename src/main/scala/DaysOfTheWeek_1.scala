object DaysOfTheWeek_1 {
  private val days = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")

  def print(): Unit = {
    println("1. Stwórz 7 elementową listę zawierającą nazwy dni tygodnia. Wypisz ją używając:")

    println("a. Pętli for")
    for (i <- days) {
      println(i)
    }

    println("\nb. Pętli for wypisując tylko dni z nazwami zaczynającymi się na „P”")
    for (i <- days if i.startsWith("P")) {
      println(i)
    }

    println("\nc. Metody foreach")
    days.foreach(println)

    println("\nd. Pętli while")
    var a = 0
    while (a < days.length) {
      println(days(a))
      a = a + 1
    }

    println("\ne. Funkcji rekurencyjnej")
    printList(days)

    println("\nf. Funkcji rekurencyjnej wypisując elementy listy od końca")
    printListFromTheEnd(days)

    println("\ng. Metod foldl i foldr")
    println(days.foldLeft("")(_ + _ + "\n"))
    println(days.foldRight(""){_ + "\n" + _})

    println("h. Metody foldl wypisując tylko dni z nazwami zaczynającymi się na „P”")
    println(days.foldLeft("")((z, f) => if (f.startsWith("P")) z + f + "\n" else z))
  }

  def printList(myList: List[Any]): Unit = {
    if (myList.nonEmpty) {
      println(myList.head)
      printList(myList.tail)
    }
  }

  def printListFromTheEnd(myList: List[Any]): Unit = {
    if (myList.nonEmpty) {
      printListFromTheEnd(myList.tail)
      println(myList.head)
    }
  }
}
