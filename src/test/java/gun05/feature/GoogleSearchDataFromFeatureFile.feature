Feature: Google search function
  Scenario: Google search for cucumber
    Given User navigate to Google website "https://www.google.com.tr/"
    When user search for "cucumber" in google
    Then user should see "cucumber" results in Google

    Scenario: Google search for Apple
      Given user navigate to Google "https://www.google.com.tr/"
      When user search for "Apple" in google
      Then user should see "Apple" results in Google

  Scenario: Google search for Apple
    Given user navigate to Google "https://www.google.com.tr/"
    When user search for "Java" in google
    Then user should see "Java" results in Google

