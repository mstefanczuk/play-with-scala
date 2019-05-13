object Tuple_3 {
  private val tuple = Tuple3(1, "Dwa", 3.3)

  def print(): Unit = {
    println("\n3. Zdefiniuj funkcję przyjmującą krotkę z 3 wartościami różnych typów i wypisującą je")
    printTuple3(tuple)
  }

  def printTuple3(tuple3: (Int, String, Double)): Unit = {
    tuple3.productIterator.foreach(println)
  }
}
