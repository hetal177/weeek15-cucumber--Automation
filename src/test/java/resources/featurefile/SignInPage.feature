Feature: Create Account Functionality
  User should be able to register


  Scenario: user should be able to navigate to signinpage successfully
    Given  user is on homepage
    When user click on signIn button
    Then user is able to navigate to signinpage successfully
  @Regression
  Scenario Outline: User should get error message when sign in with invalid credentials

    Given user is on signInPage
    When user enter "<username>"
    And user enter password "<password>"
    And user click on signIn btn
    Then user should get "<message>"
    Examples:
      | username       | password | message                    |
      |                | 123456   | An email address required. |
      | abcd@gmail.com |          | Password is required.      |
      | adfdfgfg       | 123456   | Invalid email address.     |
      | abcd@gmail.com | 123456   | Authentication failed.     |