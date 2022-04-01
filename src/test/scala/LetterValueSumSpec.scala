import org.scalatest._
import flatspec._
import matchers._

class LetterValueSumSpec extends AnyFlatSpec with should.Matchers {

  import LetterValueSum._

  "lettersToNumbers" should "be 1 for a" in {
    lettersToNumbers("a") shouldBe 1
  }

  it should "be 6 for abc" in {
    lettersToNumbers("abc") shouldBe 6
  }

  it should "be 0 for empty string" in {
    lettersToNumbers("") shouldBe 0
  }
}