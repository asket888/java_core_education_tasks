Feature: Add to cart

  Scenario Outline: Running a Full Text Addition to Card from good's page
    Given I set search request "<request>"
    And I open first in query good's page
    When I click Add_To_Cart button
    Then I transfer to cart page
    And selected good displays in my cart

    Examples:
      | request                  |
      | Suzuki hayabusa plastics |