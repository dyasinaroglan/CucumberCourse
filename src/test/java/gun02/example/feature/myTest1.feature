Feature: add to favorites
  Scenario: add to favorites
    Given go to url "http://automationpractice.com/index.php"
    When click to t-shırt
    And click on list view
    And Press the add to favorites button
    Then verify the output message "You must be logged in to manage your wishlist."