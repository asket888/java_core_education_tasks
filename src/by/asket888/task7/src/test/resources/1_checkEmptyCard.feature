Feature: Empty card checking

  Scenario: Check empty cart
    Given I go to shop's main page
    When I open my cart's page
    Then I got a message that one is empty