Feature: Verify the login functionality of the facebook

  Scenario: Validate the login functionality of the facebook
    Given user is on facebook login page
    When user enters the invlaid username and valid password
    Then user should enter the passowrd
