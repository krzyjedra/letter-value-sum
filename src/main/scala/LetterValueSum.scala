object LetterValueSum extends App {

  def lettersToNumbers(s: String): Int = {
    s.sum.toInt - (s.length * 96)
  }
  val x = "abc"
  println(lettersToNumbers(x))
}
