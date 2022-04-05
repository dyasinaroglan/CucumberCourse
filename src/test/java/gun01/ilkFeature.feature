# açıklama # ile yapılır
  #her feature dosyası feature ile başlar
  #bu feature ile ilgili detaylı açıklama yapılır.

Feature:  ilk feature denemesi
  Cucumber baslangic calismasi

  # testler Scenariolar şeklinde yazılır

  Scenario: İlk senariomuz
    Given I am on the home page
    When  user clicks to login button
    Then  login form should be visible

    #given, when, then, And, but annotationlarının kısıtlayıcı bir tarafı yok


  Scenario: ikinci scenario
    Given user clicks to login button
    When I am on the home page
    Then user clicks to login button


    #Birden fazla given varsa yani ön şart varsa and and diye devam ederim
     #When birden fazla ise and and diye devam edebilirim



  Scenario: senario2
    Given user on home page
    And user goes to login form
    When user input username
    And user input password
    And user clicks to login button
    Then page title should be My Account

