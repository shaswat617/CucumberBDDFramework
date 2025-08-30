Feature: Uber Booking Feature
  Scenario: Booking cab
    Given User wants to select a car of type "Sedan"
    When User selects car type as "Sedan" and pick up point as "Bengaluru" and drop point as "Pune"
    Then Driver starts Journey
    And Driver ends journey
    Then User pays Rs. 1000