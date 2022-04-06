Feature:
  Scenario Outline: SignIn testi
    Given websiteye git "http://automationpractice.com/index.php"
    And sıgnIN butonuna tıkla
    And "<Email>" girisi yap
    And create an account butonuna tıkla
    And Title sec
    And firstname "<firstname>" ve lastname "<lastname>" gir
    And password "<password>" gir
    When company "<company>" gir
    Then Adres "<Address>" gir

    Examples:
      | Email            | firstname    | lastname  | password    | company     | Address     |
      |omeroz@gmail.com  | omer         | ozdemır   | omer123     | technoStudy | İsveç       |
      |orhanak@gmail.com | orhan        | okdama    | omrgb1234   | amazon      | norveç      |
      |cgdemk@gmail.com  |  ciğdem      | present   | ccgdmb123   | google      |  fransa     |
