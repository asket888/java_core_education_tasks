Feature: Delete from card

  Scenario: Delete good from cart
    Given I go to main page
    When I open my cart
    And click Delete button
    Then I got a message that cart is empty