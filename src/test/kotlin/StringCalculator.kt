import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class StringCalculatorTest : ShouldSpec({
    context("when adding") {
        should("return zero given the empty string as the input") {
            add("") shouldBe "0"
        }
    }
})

fun add(number: String): String = "0"