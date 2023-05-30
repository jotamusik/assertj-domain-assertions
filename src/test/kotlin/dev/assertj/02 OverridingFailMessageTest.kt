package dev.assertj

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class `02 OverridingFailMessageTest` {
    @Test
    fun `withFailMessage() will display only the message passed if the assertion fail without the normal assertion message`() {
        val miriam = Person(
            name = "Miriam",
            age = 12,
        )
        assertThat(miriam.age)
            .withFailMessage("is not an adult")
            .isGreaterThanOrEqualTo(18)
    }

    @Test
    fun `overridingErrorMessage() will display only the message passed if the assertion fail without the normal assertion message`() {
        val miriam = Person(
            name = "Miriam",
            age = 20,
        )
        assertThat(miriam.age)
            .overridingErrorMessage("is not a child")
            .isLessThan(18)
    }
}
