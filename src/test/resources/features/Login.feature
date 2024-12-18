@All
  Feature: Login

    @Test1 @Positive @Login
    Scenario: Login Success
      Given User is on Login Page
      When User fill username and password
      And User click login button
      Then User verify login result

    @Test2 @Negative @Login
    Scenario: Login Failed
      Given User is on Login Page
      When User fill invalid username and password
      And User click login button
      Then User get error message