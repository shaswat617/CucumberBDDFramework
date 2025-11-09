Feature: Vegetable buying feature
  Scenario: User chooses to buy Potato
    Given User is on the home page of "JioMart"
    When User selects only those vegetables which is of "good quality"
    Then User will have to pay Rs. 5