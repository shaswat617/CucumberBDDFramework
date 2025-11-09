Feature: Flipkart Booking Order

  Background:
    Given User is logged into Flipkart
    When User is in Orders tab

  Scenario: Cancelled Orders
    When user navigates to "cancelled" order tab
    Then "Cancelled" order tab should be opened

  Scenario: Not shipped Orders
    When user navigates to "Not shipped" order tab
    Then "Not shipped" order tab should be opened

  Scenario: Buy again Orders
    When user navigates to "Buy Again" order tab
    Then "Buy Again" order tab should be opened