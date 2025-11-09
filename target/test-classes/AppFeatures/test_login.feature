Feature: Login Features

  Background:
    Given user is an application landing page
    When user clicks on Sign in button
    Then user is displayed login screen

  Scenario Outline: Login pass - happy flow
    When user enters "<Username>" in username field
    And user enters "<Password>" in password field
    And user clicks on sign in
    Then user is able to login successfully
    Examples:
      | Username | Password |
      | Soham    | pass76   |
      | Alivia   | pass35   |

  Scenario Outline: Login fail - negative flow
    When user enters "<Username>" in username field
    And user enters "<Password>" in password field
    And user clicks on sign in
    Then user is not able to login successfully
    Examples:
      | Username          | Password          |
      | incorrectUserName | pass76            |
      | Alivia            | incorrectPassword |