Feature: Login functionally

  Background: Login
    Given user goes to "http://opencart.abstracta.us/"
    And user clicks to My Account
    And user clicks login Link
    When user input username as "testngkurs@gmail.com" AND password as "testngkurs"
    And user clicks to submit button

    Then login should be successfull


    Scenario: User account telephon edition
      Given user clik edit Account
      Then  user edit telephone number "35789"
      And  user click to continue
      And success alert should be vsisible


      Scenario:
        Given user clicks newsletter
        Then user choose "Yes"
        And user click to Continues
        And success alert should be visible
