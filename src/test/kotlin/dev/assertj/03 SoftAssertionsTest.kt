package dev.assertj

import org.assertj.core.api.SoftAssertions
import org.junit.jupiter.api.Test

internal class `03 SoftAssertionsTest` {
    @Test
    fun `SoftAssertions() will display all assertion errors not only fail on the first one`() {
        val softly = SoftAssertions()

        val miriam = Person(
            name = "Miriam",
            age = 14,
        )

        val peter = Person(
            name = "Peter",
            age = 40,
        )

        softly.assertThat(miriam.age)
            .withFailMessage("is an adult")
            .isGreaterThanOrEqualTo(18)

        softly.assertThat(peter.age)
            .withFailMessage("is a child")
            .isLessThan(18)

        softly.assertAll()
    }
}