object Option_4 {
  private val programmingLanguages = Map("Java" -> "Cool", "Scala" -> "SUPER COOL")

  def print(): Unit = {
    println("\n4. Zaprezentuj działanie Option na dowolnym przykładzie (np. mapy, w której\n" +
      "wyszukujemy wartości po kluczu)")
    println("programmingLanguages.get( \"Java\" ) : " + programmingLanguages.get("Java"))
    println("programmingLanguages.get( \"Brainfuck\" ) : " + programmingLanguages.get("Brainfuck"))
  }
}
