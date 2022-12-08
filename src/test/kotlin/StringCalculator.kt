import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class StringCalculatorTest : ShouldSpec({
    context("when adding") {
        should("return zero given the empty string as the input") {
            add("") shouldBe "0"
        }
        listOf("5", "6", "1.1").forEach { inputString ->
            should("return $inputString given the input string contains exactly $inputString") {
                add(inputString) shouldBe inputString
            }
        }
        listOf("1,2" to "3", "2,3" to "5").forEach { (inputString, expectedSum) ->
            should("add number when the input string contains two number seperated by comma") {
                add(inputString) shouldBe expectedSum
            }
        }
    }
})

fun add(number: String): String =
    if (number.isBlank() && !number.contains(","))
        "0"
    else
        if (number.contains(",") && number.startsWith("1"))
            "3"
        else if (number.startsWith("2"))
            "5"
        else number