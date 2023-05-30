package dev.assertj

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class `00 SimpleAssertTest` {
    @Test
    fun `will display the normal assertion error message when failing`() {
        val miriam = Person(
            name = "Miriam",
            age = 12,
        )
        assertThat(miriam.age)
            .isGreaterThanOrEqualTo(18)
    }
}
