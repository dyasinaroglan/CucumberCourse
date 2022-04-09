Feature: Google search functionaly
  Scenario: search for cucumber in google
    Given user navigate to Google "https://www.google.com.tr/?hl=tr"
    When user search for cucumber in google
    Then user should see cucumber results in Cucumber