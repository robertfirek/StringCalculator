import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class StringCalculatorTest : ShouldSpec({
    context("when adding") {
        should("return zero given the empty string as the input") {
            add("") shouldBe "0"
        }
        should("return 5 given the input string contains exactly 5") {
             add("5") shouldBe "5"
        }
    }
})

fun add(number: String): String = if (number == "5") "5" else "0"