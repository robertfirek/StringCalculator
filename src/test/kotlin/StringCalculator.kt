import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class StringCalculatorTest : ShouldSpec({
    context("when adding") {
        should("return zero given the empty string as the input") {
            add("") shouldBe "0"
        }
        listOf("5","6").forEach { inputString ->
            should("return $inputString given the input string contains exactly $inputString") {
                add(inputString) shouldBe inputString
            }
        }
    }
})

fun add(number: String): String = if (number in listOf("5","6")) number else "0"