Feature: Booking a table in restaurant feature
  Scenario: User is looking for the best restaurant in the city
    Given User is looking for a restaurant with 5 star rating
    When User clicks on filter and selects restaurants with rating as 5
    Then User should be able to see restaurants rated as 5 in results

  Scenario: User is looking for a descent and comparatively economical restaurants
    Given User is looking for an "economical" and "descent" restaurant
    When User clicks on filter and selects restaurants with rating 4 and price tag as "economical"
    Then User should be able to see restaurants rated as 4 and is "economical"