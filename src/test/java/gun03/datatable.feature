Feature: datatable feature

  Scenario: datatable as list

    Given user write "java"
    #tek bir list, türü string
    When user write the followings
      | Java   |
      | C#     |
      | Python |

    When  user write the followings Integers
      | 1 |
      | 2 |
      | 3 |
    #listlerin listesi, her satır liste.
    When  ıse write the following integers
      | 1 | 12 |
      | 2 | 8  |
      | 3 | 7  |

    # [
    #   [1,12]
    #   [2,8]
    #   [3,7]   listenin içerisinde listeler var. listlerin listesi
    # ]

    When user login as follows

      | kullanıcı1 | sifre1 | 0 |
      | kullanıcı2 | sifre2 | 0 |
      | kullanıcı3 | sifre3 | 1 |
