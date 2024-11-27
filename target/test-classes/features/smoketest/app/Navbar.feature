@navigation-feature

Feature: Navigation scenario

  Scenario Outline: Verify the navigation includes menu icon, Logo and cart icon
    When I accessed to Homepage successfully
    Then Menu icon will be displayed
    And Logo SWAGLABS will be displayed
    And Cart icon will be displayed
    Examples:
      | example |
      | example |

  Scenario Outline: Verify the side bar menu is displayed
    Given I logged in successfully
    When I click on the menu icon
    Then The sidebar menu should be visible
    Examples:
      | example |
      | example |

  Scenario Outline: Verify not have any actions when clicking logo
    Given I logged in successfully
    When I click on Logo SWAGLABS
    Then No action occurs
    Examples:
      | example |
      | example |

  Scenario Outline: Verify Cart screen is displayed
    Given I logged in successfully
    When I click on the cart icon
    Then YOUR CART screen will be displayed
    Examples:
      | example |
      | example |