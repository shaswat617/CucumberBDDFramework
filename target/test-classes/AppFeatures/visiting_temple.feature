Feature: Visiting the temple with essentials

  @Smoke
  Scenario: User should be able to offer essentials to Eeshwar
    Given User has already the essentials to offer pray to Shiva
    When User goes to temple with essentials
    Then User should be able to offer pray to Shiva

  @Regression
  Scenario: User should be able to offer essentials if he buy those from the temple
    Given User go to the Temple without essentials
    When User has to buy those essentials from the Temple
    Then User should be able to offer pray to Narayan
