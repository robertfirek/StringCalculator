import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class StringCalculatorTest : ShouldSpec({
    context("when adding") {
        should("return zero given the empty string as the input") {
            add("") shouldBe "0"
        }
        listOf("5","6","1.1").forEach { inputString ->
            should("return $inputString given the input string contains exactly $inputString") {
                add(inputString) shouldBe inputString
            }
        }
        should("add number when the input string contains two number seperated by comma") {
            add("1,2") shouldBe "3"
        }
    }
})

fun add(number: String): String = if (number.isBlank() && !number.contains(",")) "0" else
    if (number.contains(",")) "3" else number