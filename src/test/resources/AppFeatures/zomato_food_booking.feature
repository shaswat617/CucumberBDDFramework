Feature: Zomato food booking feature
  As an end user I would like to check zomato
  food booking feature to check if the happy flow
  is working properly or not

  Background:
    Given User has launched the zomato application on the device
    And User is already logged in into this app
    When User enters username
    And User enters password
    And User clicks on Login button
    Then User is redirected to the home page of the app

  Scenario: User is able to select multiple items
    Given User has selected an item already
    When User keeps more items to the list
    Then User should be able to add all the items properly

  Scenario: User is able to deselect some items from the list
    Given User has added some items in the list
    When User deselects some items from zomato app
    Then User should not be able to see those deselected items from the list anymore
