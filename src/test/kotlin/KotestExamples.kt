import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import io.kotest.matchers.string.shouldStartWith

class KotestExamples : ShouldSpec({
    context("parameterised tests") {
        (1..5 step 2).forEach { oddNumber ->
            should("show how to generate test for odd number $oddNumber") {
                oddNumber % 2 shouldNotBe 0
            }
        }
        (0..5 step 2).forEach { evenNumber ->
            should("show how to generate test for even number ($evenNumber)") {
                evenNumber % 2 shouldBe 0
            }
        }
    }
    context("exception tests") {
        should("catch exception and test it details") {
            val exception = shouldThrow<IllegalAccessException> {
                throw IllegalAccessException("Something went wrong but I don't know what")
            }
            exception.message shouldStartWith ("Something went wrong")
        }
    }
})