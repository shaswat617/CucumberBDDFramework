Feature: Grocery items adding to cart
  Background:
    Given User has valid login credentials of JioMart
    And User has an active Jio number

  Scenario: Adding fruits to cart
    When User adds fruits to the cart
    | seasonal | mango | alphonso | big |
    | exotic | dragonfruit | red | small |
    | organic | grapes | green seedless | big |
    And User provides the quantity of each item
    Then User is redirected to payment page

  Scenario: Adding milk and dairy products to the cart
    When User adds milk and bakery products to the cart
    | milk | toned | 500ml | 5-sept |
    | bread | white | big | 10-sept |
    And User provides the quantity of each item
    Then User is redirected to payment page

  Scenario: Adding electronics products to cart
    When User adds electronic products to the cart
    | tv | sony |
    | mobile | samsung |
    And User provides the quantity of each item
    Then User is redirected to payment page