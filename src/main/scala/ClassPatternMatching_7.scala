object ClassPatternMatching_7 {

  def print(): Unit = {
    println("\n7. Zdefiniuj klasę Osoba z własnościami imie i nazwisko. Stwórz kilka instancji tej\n" +
      "klasy. Zdefiniuj funkcję, która przyjmuje obiekt klasy osoba i przy pomocy\n" +
      "Pattern Matching wybiera i zwraca napis zawierający przywitanie danej osoby.\n" +
      "Zdefiniuj 2-3 różne przywitania dla konkretnych osób (z określonym imionami\n" +
      "lub nazwiskami) oraz jedno domyślne.")

    val janusz = Osoba("Janusz", "Korwin Mikke")
    val bob = Osoba("Bob", "Budowniczy")
    val pat = Osoba("Pat", "Listonosz")

    hello(janusz)
    hello(bob)
    hello(pat)
  }

  def hello(osoba: Osoba): Unit = {
    printf(osoba.imie + " " + osoba.nazwisko + " -> ")
    osoba match {
      case Osoba("Janusz", "Korwin Mikke") => printf("Dzień dobry panie Januszu! Ile procent pan przewiduje w " +
        "następnych wyborach?")
      case Osoba("Bob", "Budowniczy") => printf("Cześć Bob! Jak tam idzie budowa?")
      case Osoba(imie, nazwisko) => printf(s"Witaj, $imie $nazwisko")
    }
    println()
  }

  case class Osoba(imie: String, nazwisko: String)

}
