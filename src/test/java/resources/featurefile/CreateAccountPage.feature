Feature: Register user

  Scenario: user should be able to create account successfully
    Given  user is on signInPage
    When user fill personal informatiom
    And user fill address details
    And user click on Register Button