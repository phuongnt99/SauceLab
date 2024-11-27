@menu-feature
Feature: Menu Interaction

  Scenario Outline: Click on menu icon then menu is opened
    Given I logged in successfully
    When I click on the menu icon
    Then The sidebar menu should be visible
    Examples:
      |example |
      |example|

