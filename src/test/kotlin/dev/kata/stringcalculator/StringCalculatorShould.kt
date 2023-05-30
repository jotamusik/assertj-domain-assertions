package dev.kata.stringcalculator

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mockito.kotlin.doThrow
import org.mockito.kotlin.mock

internal class StringCalculatorShould {
    @Test
    fun `throw not implemented`() {

        val dependencyMock = mock<StringCalculatorDependency> {
            on { doSomething() }
            doThrow(NotImplementedError("Time to do some TDD..."))
        }

        assertThatExceptionOfType(NotImplementedError::class.java)
            .isThrownBy {
                StringCalculator(dependencyMock).execute()
            }.withMessage("Time to do some TDD...")
    }
}
