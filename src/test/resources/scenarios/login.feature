@login
Feature: Login feature
  #Sample Test Scenario Description

  @login
  Scenario: Invalid login email
    Given I start application by name "TK Preprod"
    And I am using an AppiumDriver
    When users login with email
    And enter email "test@travelperk"
    And enter password "1234"
    And tap login button
    Then it should show error message