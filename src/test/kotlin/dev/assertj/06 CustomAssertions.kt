package dev.assertj


import dev.assertj.`06 CustomAssertions`.PersonAssert.Companion.assertThat
import org.assertj.core.api.AbstractAssert
import org.junit.jupiter.api.Test

internal class `06 CustomAssertions` {
    class PersonAssert private constructor(
        actual: Person
    ) : AbstractAssert<PersonAssert, Person>(actual, PersonAssert::class.java) {

        companion object {
            fun assertThat(actual: Person) = PersonAssert(actual)
        }

        fun isChild(): PersonAssert {
            isNotNull
            if (actual.age >= 18) {
                failWithMessage("Expected <%s> to be a child but was an adult", actual.name)
            }
            return this
        }

        fun isAdult(): PersonAssert {
            isNotNull
            if (actual.age < 18) {
                failWithMessage("Expected <%s> to be an adult but was a child", actual.name)
            }
            return this
        }
    }

    @Test
    fun `will display our own assertions and failure messages`() {
        val miriam = Person(
            name = "Miriam",
            age = 12,
        )
        assertThat(miriam).isAdult()
    }
}
