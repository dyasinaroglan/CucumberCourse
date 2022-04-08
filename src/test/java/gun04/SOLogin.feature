@LoginTest
Feature: login assert with scenario outline


  Scenario Outline: login functionality
    Given user goes to "http://opencart.abstracta.us/"
    And user clicks to My Account
    And user clicks login Link
    When  user fill the login form as follows

    Then login should be "<status>"
      | username | <username> |
      | password | <password> |

    Examples:
      | username              | password    | status |
      | testngkurs@gmail.com  | testngkurs  | true   |
      | testngkurs1@gmail.com | testngkurs1 | false  |
      | testngkurs2@gmail.com | testngkurs1 | false  |
      | testngkurs@gmail.com  | testngkurs  | true   |

@LoginTestScenario
  Scenario Outline: login functionality scenario
    Given user goes to "http://opencart.abstracta.us/"
    And user clicks to My Account
    And user clicks login Link
    When  user fill the login form as follows

      | username | <username> |
      | password | <password> |

    Then login should be "<status>"
    And close the browser
    Examples:
      | username | password | status |
    #bu bir kere yapacak  diğeri ise  example kadar tekrar eder.



