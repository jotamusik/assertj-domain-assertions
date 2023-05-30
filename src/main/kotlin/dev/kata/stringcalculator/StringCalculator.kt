package dev.kata.stringcalculator

class StringCalculator(
    private val dependency: StringCalculatorDependency,
) {
    fun execute() {
        dependency.doSomething()
    }
}

class StringCalculatorDependency {
    fun doSomething() {}
}
