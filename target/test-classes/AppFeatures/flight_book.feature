Feature: Flight booking feature

  @Regression
  Scenario: Flight book from Bhubaneswar to Delhi
    Given User has launched the flight booking page of "Indigo"
    When User selects the origin as "Bhubaneswar" and destination as "Delhi"
    Then User should be able to pay Rs. 3000

  @Regression
  Scenario: Flight book from Mumbai to Delhi
    Given User has launched the flight booking page of "Air India"
    When User selects the origin as "Mumbai" and destination as "Delhi"
    Then User should be able to pay Rs. 5000

  @Regression
  Scenario: Flight book from Mumbai to Chennai
    Given User has launched the flight booking page of "Spicejet"
    When User selects the origin as "Mumbai" and destination as "Chennai"
    Then User should be able to pay Rs. 7000