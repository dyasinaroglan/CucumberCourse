Feature: Login to web app

  Scenario: login to website - email input
    Given Navigate to Website "http://demowebshop.tricentis.com/login"
    When user enter invalid email adress
      | kullancı11@gmail.com |
      | kullancı22@gmail.com |
      | kullancı33@gmail.com |
      | kullancı44@gmail.com |
      | kullancı55@gmail.com |
    Then User should see a warning
