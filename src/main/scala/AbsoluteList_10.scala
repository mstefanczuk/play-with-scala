object AbsoluteList_10 {

  private val numbers = List(-89, -9, -2.2, -1, 0.5, 1.1, 2, 99, 789.9)
  private val absoltueNumbers = getAbsoluteElements(numbers)

  def print(): Unit = {
    println("\n\n10. Stwórz funkcję przyjmującą listę liczb rzeczywistych i zwracającą stworzoną na\n" +
      "jej podstawie listę zawierającą wartości bezwzględne elementów z oryginalnej\n" +
      "listy należących do przedziału <-5,12>")

    println("Początkowa lista:")
    numbers.foreach(number => printf(number + " "))
    println("\nLista wartosci bezwzglednych:")
    absoltueNumbers.foreach(number => printf(number + " "))
  }

  def getAbsoluteElements(list: List[Double]): List[Double] = {
    list.filter(_ >= -5).filter(_ <= 12).map(n => Math.abs(n))
  }
}
