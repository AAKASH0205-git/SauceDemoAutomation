Feature: Login functionality of SauceDemo

  Scenario: Successful login with valid credentials
    Given user is on the SauceDemo login page
    When user enters valid username and password
    Then user should be logged in successfully

  Scenario: Login with invalid credentials
    Given user is on the SauceDemo login page
    When user enters invalid username and password
    Then user should see an error message