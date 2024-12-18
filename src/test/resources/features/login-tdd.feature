Feature: Login With TDD

  @TDD @Login
  Scenario Outline: Login with TDD
    Given User is on Login Page
    When User fill username <username> and password <password>
    And User click login button
    Then User verify login result <result>

    Examples:
      | username | password | result |
      | standard_user    | secret_sauce | success|
      | problem_user   | secret_sauce | success |
      | standard_sauce   | secret_sauce | failed |
      | wrong_user       | wrong_password | failed |