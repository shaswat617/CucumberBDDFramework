Feature: Buy flat feature

  @Smoke
  Scenario: User on applying filters that is flats within 10000000 should get proper results
    Given User is on "99acres" landing page
    And User has chosen "Andheri" location
    When User applies range as Rs. 10000000
    Then User should get proper results

  @Sanity
  Scenario: User on applying filters that is flats within 5000000 should get proper results
    Given User is on "FlatZap" landing page
    And User has chosen "Bhubaneswar" location
    When User applies range as Rs. 5000000
    Then User should get proper results

  @Regression
  Scenario: User on applying filters that is flats within 7500000 should get proper results
    Given User is on "book99" landing page
    And User has chosen "Noida" location
    When User applies range as Rs. 7500000
    Then User should get proper results