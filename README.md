# AssertJ Domain Assertions

## Description

## Description

This repo contains small steps to write tests that describe our domain business rules
with the ubiquitous language and not only data comparison failure messages.

- **00 Simple Assertion:** A common test example without ubiquitous language, using plain AssertJ assertions
- **01 As and Describe override:** Adding error message on failure. It will display both, comparison message + override one
- **02 withFailMessage override:** Adding error message on failure. It will display only the passed fail message
- **03 Soft Assertion:** By using soft assertions, all errors will be displayed
- **04 Matches Assertion:** Using matches, we can evaluate complex expressions and specify a message for it
- **05 Conditions:** By using AssertJ conditions we can evaluate complex expressions as matches does, but we can reuse them
- **06 Custom Assertion:** By using AssertJ custom assertions, our test code and the failure messages express our business rules
