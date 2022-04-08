Feature:

  Scenario: normal scenario
    Given user write console "java"
    When user add the following numbers
      | 5 |
      | 3 |
    Then solution should be 8

  Scenario Outline:
    Given user write console "<consoleText>"

    When user add <number1> and <number2>


    Then solution should be <sonuc>

    Examples:
      | consoleText | number1 | number2 | sonuc |
      | java        | 1       | 2       | 3     |
      | Python      | 10      | 20      | 30    |





      #işte ben bu example' istediğim adımda kullabilirim.
  #tüm senario da kullanılabilir. tek stepde de kullanılabilir.
  #example'daki başlık hariç satır sayısı kadar scenario devam eder.

  #number1 i definition yaptığımızda number kısmını string olarak görüyor.
  # 1 i ise integer olarak görüyor. o yüzden biz number çıkan kısmı elimizle silmemiz gerekir.
  # verileri farklı senaryolarda kullanma ihtiyacım var ise Scenario Outline kullanıyorum
  #Example sasdece Scenario Outline da geçerlidir