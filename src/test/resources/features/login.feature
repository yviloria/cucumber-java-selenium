@SmokeScenario
Feature: feature login functionality DEMO

  @SmokeTest
  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enter username@grr.la and password
    And clicks button login
    Then user navigated home page

  Scenario Outline: Check login is successful with valid credentials
    Given user is on login page
    When user enter <username> and <password>
    And clicks button login
    Then user navigated home page
    Examples:
      | username     | password |
      | app@gate.com | passwor1 |
