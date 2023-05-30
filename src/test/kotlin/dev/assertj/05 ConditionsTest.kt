package dev.assertj

import dev.assertj.`06 CustomAssertions`.PersonAssert.Companion.assertThat
import org.assertj.core.api.Condition
import org.assertj.core.api.SoftAssertions
import org.junit.jupiter.api.Test

internal class `05 ConditionsTest` {
    @Test
    fun `will display a domain condition message based on the condition passed`() {
        val anAdult = Condition<Person>({ it.age >= 18 }, "an adult")
        val aChild = Condition<Person>({ it.age < 18 }, "a child")

        val miriam = Person(
            name = "Miriam",
            age = 12,
        )
        val peter = Person(
            name = "Peter",
            age = 40,
        )

        SoftAssertions.assertSoftly {
            it.assertThat(miriam).`is`(anAdult)
            it.assertThat(peter).`is`(aChild)
        }
    }

    @Test
    fun `miriam should be an adult`() {
        val moreThan18YearsOld = Condition<Person>({ it.age >= 18 }, "more than 18 years old")
        val miriam = Person(
            name = "Miriam",
            age = 12,
        )
        assertThat(miriam).has(moreThan18YearsOld)
    }
}
