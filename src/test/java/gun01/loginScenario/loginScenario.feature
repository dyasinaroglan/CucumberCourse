Feature: login test
  Scenario: go to site and login test
    Given navigate to site
    When click to contact us button
    And click the subject heading button and select
    And Enter email adress
    And enter order referance
    And message write
    And click to send button
    Then check the confirmation message