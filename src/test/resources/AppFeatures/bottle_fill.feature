Feature: Bottle filling feature

  @Smoke @Sanity @User-Story-123 @JIRA-232
  Scenario: On pouring water inside the bottle, it should be filled
    Given User has a bottle of "Milton" brand
    When User starts pouring the water inside the bottle of capacity 2 litres
    Then User should be able to fill 2 litres of water inside bottle

  @Regression @User-Story-123 @JIRA-233
  Scenario: On emptying the bottle, it should be empty
    Given User has a bottle of "Borosil" brand
    When User starts emptying the bottle of capacity 2 litres
    Then User should be able to empty water from the bottle