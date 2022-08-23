Feature: Login into application

  @login
  Scenario: verify user able to login
    Given user launches application
    When enters valid credentials
    Then user navigated to homepage
