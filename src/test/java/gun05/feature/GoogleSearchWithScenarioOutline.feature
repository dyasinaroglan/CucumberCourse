Feature: Search functionality Scenario Outline

  Scenario Outline: Search function with different data
    Given user navigate to "https://www.google.com.tr/"
    When user search for the "<SearchData>" in google
    Then user should see results related to "<ResultItem>"

    Examples:
      | SearchData | ResultItem |
      | Mac        | Mac        |
      | Selenium   | Selenium   |
      | Java       | Java       |
      | Github     | Git        |


