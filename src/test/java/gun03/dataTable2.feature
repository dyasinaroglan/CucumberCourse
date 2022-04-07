Feature: datatable map

  Scenario: map işlemleri
    # sol sütunlar key, sağ sütun value'lar
    #table.asMap()
    Given map birinci yöntem
      | key     | value |
      | name    | java  |
      | version | 1.8   |
    #ilk satırlar key, diğerleri value dır.
    #table.asMaps()
    # ilk satır hariç ne kadar satır varsa o kadar map vardır.
    When map ikinci yöntem list of maps
      | name    | surname | age |
      | ali     | yılmaz  | 23  |
      | veli    | durmaz  | 33  |
      | hasan   | deniz   | 29  |
      | hüseyin | dag     | 22  |

    When login map ikinci yöntem list of maps

    |email|password|status|
    |kullanıcı1@gmail.com|kullanıcı1|0|
    |kullanıcı2@gmail.com|kullanıcı2|0|
    |kullanıcı3@gmail.com|kullanıcı3|0|
    |testngkurs@gmail.com|testngkurs|1|
