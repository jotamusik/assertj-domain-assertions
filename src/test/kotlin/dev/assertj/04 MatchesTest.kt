package dev.assertj

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class `04 MatchesTest` {
    @Test
    fun `will display the message that you passed when the passed supplier returns false`() {
        val miriam = Person(
            name = "Miriam",
            age = 12,
        )

        assertThat(miriam).matches({
            it.age > 18
        }, "is an adult")
    }
}
