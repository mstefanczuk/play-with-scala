object ProductsMaps_2 {
  private val products = Map("laptop" -> 3000, "monitor" -> 1500, "kabel do iphona" -> 20000)
  private val productsAfterDiscount = products.mapValues(v => 0.9*v)

  def print(): Unit = {
    println("2. Stwórz mapę z nazwami produktów i cenami. Na jej podstawie wygeneruj drugą,\n" +
      "z 10% obniżką cen. Wykorzystaj mechanizm mapowania kolekcji.")
    println(products)
    println(productsAfterDiscount)
  }
}
