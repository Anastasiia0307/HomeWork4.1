Feature: Form automation
  As a user I want to fill my form
  also I submit it

  Scenario: Form filling and submition
    Given user navigates to the app url
    When user fills first name
    And user fills last name
    And user fills date of birth
    And user fills email
    And user fills company
    And user fills roles
    And user fills jobExpectation
    And user fills ways
    And user fills comment
    And user fills address
    And user fills password
    And user fills gender
    And user submit form
    Then form is submitted
