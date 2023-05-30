package dev.assertj

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class `01 UsingAsForDescribingAssertionsTest` {
    @Test
    fun `as() will display both the passed and the normal assertion error message when failing`() {
        val miriam = Person(
            name = "Miriam",
            age = 12,
        )
        assertThat(miriam.age)
            .`as`("is not an adult")
            .isGreaterThanOrEqualTo(18)
    }
    @Test
    fun `describedAs() will display both the passed and the normal assertion error message when failing`() {
        val miriam = Person(
            name = "Miriam",
            age = 12,
        )
        assertThat(miriam.age)
            .describedAs("is not an adult")
            .isGreaterThanOrEqualTo(18)
    }
}
