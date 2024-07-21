@smoke
Feature: Wikipedia search screen

  As a regular user of the Wikipedia application, I want to be able to perform search by text.

  @smoke
  @regression
  Scenario: Open the search screen and perform search
    Given user open application
    When user tap on the search field
    And user type in search line "Appium"
    Then user can see a link with text "Automation for Apps" in the search results and click it