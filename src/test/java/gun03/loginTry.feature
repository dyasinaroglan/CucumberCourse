Feature: Login try

  Scenario: login
    Given user goes to "http://opencart.abstracta.us/"
    And user clicks to My Account
    And  user clicks login Link

    When user login as follows

      | kullanıcı1           | sifre1     | 0 |
      | kullanıcı2           | sifre2     | 0 |
      | testngkurs@gmail.com | testngkurs | 1 |

