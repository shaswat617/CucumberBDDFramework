Feature: Login Page
  In order to test login page
  As a registered user
  I want to specify the login conditions

  Scenario: Amazon login page
    Given User is on Amazon page
    And Sign in button is present on screen
    When user clicks on sign in button
    Then user can see login screen
    When user enters "name@gmail.com" in username field
    When user enters "test@123" in password field
    When user clicks sign in button
    Then user is on homepage
    Then title of home page is "Amazon homepage"

  Scenario: Amazon login page
    Given User is on Amazon page
    And Sign in button is present on screen
    When user clicks on sign in button
    Then user can see login screen
    When user enters "name@gmail.com" in username field
    And user enters "test@123" in password field
    And user clicks sign in button
    Then user is on homepage
    And title of home page is "Amazon homepage"
    But Sign in button is not present