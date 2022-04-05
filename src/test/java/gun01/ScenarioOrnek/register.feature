Feature:
  #outline dışaradan bilgi almak istiyorsak
  Scenario Outline: Create an account
    Given navigate to webSite
    When click sign in button
    And type email "<Email>"
    And  click create and Account button
    And choose title
    And type firstname "<firsname>" and lastname "<lastname>"
    And  type password "<password>"
    And type company "<company>"
    And type adress "<adress>"
    Examples:
      | Email | firsname | lastname | password | company | adress |
    |yasinargln264@gmail.com |yasin |aroglan |264264 |technostudy |istanbul |
      |kisi1@gmail.com |kisi1|kisi1Soyad |123466 |amazon |new jersey |
      |kisi2@gmail.com |kisi2|kisi2Soyad |1234679|google |Atalanta |
