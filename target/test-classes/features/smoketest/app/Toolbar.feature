@toolbar-feature
Feature: Toolbar scenario

  Scenario Outline: Verify the toolbar includes title, toggle view and filter button
    When I logged in successfully
    Then The PRODUCTS text is displayed
    And The toggle-view button is displayed
    And The filter is displayed
    Examples:
      | example |
      | example |

  Scenario Outline: Verify the view is switched from 2 image-view mode into 1 image-view mode
    Given I logged in successfully
    And The view is currently displaying 2 images
    When I click on the toggle-view button
    Then The view should display 1 image only
    Examples:
      | example |
      | example |

  Scenario Outline: Verify the view is switched back from 1 image-view mode into 2 image-view mode
    Given The view is in 1 image view mode
    When I click on the toggle-view button
    Then The view should display 2 images
    Examples:
      | example |
      | example |

  Scenario Outline: Verify the filter popup is opened
    Given I logged in successfully
    When I click on filter button
    Then The filter popup is opened
    Examples:
      | example |
      | example |

