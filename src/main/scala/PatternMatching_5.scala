object PatternMatching_5 {

  def print(): Unit = {
    println("\n5. Wykorzystaj Pattern Matching w funkcji przyjmującej parametr typu String. Dla\n" +
      "stringów odpowiadających nazwom dni tygodnia funkcja ma zwrócić „Praca” i\n" +
      "„Weekend” (odpowiednio dla dni roboczych i wolnych), dla pozostałych napisów\n" +
      "„Nie ma takiego dnia”.")

    printTypeOfDay("Wtorek")
    printTypeOfDay("Sobota")
    printTypeOfDay("Piątunio")
  }

  def printTypeOfDay(day: String): Unit = {
    printf(day + " -> ")
    day match {
      case "Poniedzialek" | "Wtorek" | "Sroda" | "Czwartek" | "Piatek" => printf("Praca")
      case "Sobota" | "Niedziela" => printf("Weekend")
      case _ => printf("Nie ma takiego dnia")
    }
    println()
  }
}
