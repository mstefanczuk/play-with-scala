object RemoveZerosFromIntegerList_8 {

  private val numbers = List(-1, 0, 1, 2, 3, 4, 0, 5, 6, 0, 0, 7)
  private val numbersWithoutZeros = removeZeros(numbers)

  def print(): Unit = {
    println("\n8. Napisz funkcję usuwającą zera z listy wartości całkowitych (tzn. zwracającą listę)")

    println("Początkowa lista:")
    numbers.foreach(number => printf(number + " "))
    println("\nLista bez zer:")
    numbersWithoutZeros.foreach(number => printf(number + " "))
  }

  def removeZeros(list: List[Int]): List[Int] = {
    list.filter(_ != 0)
  }
}
