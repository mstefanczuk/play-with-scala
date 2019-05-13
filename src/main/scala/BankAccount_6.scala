object BankAccount_6 {

  def print(): Unit = {
    println("\n6. Zdefiniuj klasę KontoBankowe z metodami wplata i wyplata oraz\n" +
      "własnością stanKonta - własność ma być tylko do odczytu. Klasa powinna\n" +
      "udostępniać konstruktor przyjmujący początkowy stan konta oraz drugi,\n" +
      "ustawiający początkowy stan konta na 0.")

    val kontoBankowe = new KontoBankowe()
    println("Aktualny stan konta:")
    println(kontoBankowe.aktualnyStanKonta)
    println("Wplacamy 100")
    kontoBankowe.wplata(100)
    println("Aktualny stan konta:")
    println(kontoBankowe.aktualnyStanKonta)
    println("Wyplacamy 50")
    kontoBankowe.wyplata(50)
    println("Aktualny stan konta:")
    println(kontoBankowe.aktualnyStanKonta)

    val kontoBankowe2 = new KontoBankowe(50000)
    println("Tworzymy nowe konto bankowe z poczatkowym stanem konta 50000. Aktualny stan konta:")
    println(kontoBankowe2.aktualnyStanKonta)
  }

  class KontoBankowe {
    private var stanKonta = 0

    def this(stanKonta: Int) {
      this()
      this.stanKonta = stanKonta
    }

    def wplata(kwota: Int): Unit = {
      stanKonta = stanKonta + kwota
    }

    def wyplata(kwota: Int): Unit = {
      stanKonta = stanKonta - kwota
    }

    def aktualnyStanKonta: Int = stanKonta
  }

}
