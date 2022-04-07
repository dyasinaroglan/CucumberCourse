#without Examples Keyword
#Scenario: Free CRM Login Test Scenario
#
#Given user is already on Login Page
#When title of login page is Free CRM
#Then user enters "naveenk" and "test@123"
#Then user clicks on login button
#Then user is on home page


#with Examples Keyword
Feature:
  Scenario Outline: free CRM login test scenario
    Given user is already on login page "https://www.freecrm.com/index.html"
    When title of login page is free CRM
    And login click
    Then user enters "<username>" and "<password>"
    Then user clicks on login button
    Then user is on home page
    Then close the browser

    Examples:
      | username | password |
      | naveenk  | test@123 |
      | tom      | test456  |