object IncrementListElements_9 {

  private val numbers = List(-2, -1, 0, 1, 2)
  private val incrementedNumbers = incrementElements(numbers)


  def print(): Unit = {
    println("\n\n9. Zdefiniuj funkcję, przyjmującą listę liczb całkowitych i zwracającą wygenerowaną\n" +
      "na jej podstawie listę, w której wszystkie liczby zostały zwiększone o 1.\n" +
      "Wykorzystaj mechanizm mapowania kolekcji.")

    println("Początkowa lista:")
    numbers.foreach(number => printf(number + " "))
    println("\nLista ze zwiekszonymi o 1 elementami:")
    incrementedNumbers.foreach(number => printf(number + " "))
  }

  def incrementElements(list: List[Int]): List[Int] = {
    list.map(n => n + 1)
  }
}
