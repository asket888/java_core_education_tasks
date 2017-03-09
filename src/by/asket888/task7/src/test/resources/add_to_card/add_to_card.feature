Feature: Add to cart

  Scenario: Check empty cart
      Given I go to shop's main page
      When I open my cart's page
      Then I got a message that one is empty

  Scenario Outline: Running a Full Text Addition to Card from good's page
      Given I set search request "<request>"
      And I open first in query good's page
      When I click Add_To_Cart button
      Then I transfer to cart page
      And selected good displays in my cart

  Examples:
        | request                  |
        | iPhone 7                 |
        | Suzuki hayabusa plastics |
        | Motorcycle gloves        |

  Scenario: Delete good from cart
      Given I go to main page
      When I open my cart
      And click Delete button
      Then I got a message that cart is empty