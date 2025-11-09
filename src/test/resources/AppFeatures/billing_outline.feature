Feature: Calculate billing amount

  Scenario Outline: Billing Amount
    Given User is on billing page
    When User enters billing amount "<billingAmount>"
    And user enters tax amount "<tax Amount>"
    And user clicks on calculate button
    Then it gives final amount "<final Amount>"
    Examples:
      | billingAmount | tax Amount | final Amount |
      | 1000          | 100       | 1010        |
      | 2000          | 1         | 2002        |
      | 1000          | 5.5       | 1005.5      |