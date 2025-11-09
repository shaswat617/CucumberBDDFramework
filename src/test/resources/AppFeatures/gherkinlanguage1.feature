Feature: Home Page
  In order to test Amazon homepage
  of application
  As a registered user
  I want to specify the various functionalities of home page

  Scenario: Home page Top Panel section
    Given user is on Amazon homepage
    Then user gets a Amazon search field
    And Username is also displayed next to search field
    And amazon logo is also displayed
    And Cart Lonk is also displayed

  Scenario: Amazon today's deals section
    Given user is on Amazon homepage
    When user scrolls down to Todays deals section
    Then user gets the list of multiple products
    And user gets product image and price details
    And user can see more products by clicking an carousel

  Scenario: Amazon footer links section
    Given user is on Amazon homepage
    When user scrolls down to footer of the page
    Then user gets all get to know us footer links
      | About Amazon   |
      | Careers        |
      | Press Releases |
    And user gets all make money with us footer links
      | Sell on Amazon                |
      | Sell under Amazon Accelerator |
      | Amazon Global Selling          |
      | Supply to Amazon              |