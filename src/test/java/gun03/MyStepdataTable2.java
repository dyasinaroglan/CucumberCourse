package gun03;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class MyStepdataTable2 {

    @Given("map birinci yöntem")
    public void mapBirinciYöntem(DataTable table) {

        Map<String, String> map = table.asMap(String.class,String.class); //buraya hiçbir şey yazmasam string olarak görür.
        System.out.println(table);
        System.out.println(map);
        System.out.println(map.get("name"));
    }

    @When("map ikinci yöntem list of maps")
    public void mapIkinciYöntemListOfMaps(DataTable table) {
        List<Map<String,String>> maps = table.asMaps();
        System.out.println(maps);
        System.out.println("**********************");
        for (Map<String, String> map : maps) {
            System.out.println(map.get("name")+", "+map.get("surname")+", "+map.get("age"));
        }
    }
    @When("login map ikinci yöntem list of maps")
    public void loginMapIkinciYöntemListOfMaps(DataTable table) {
        List<Map<String,String>> maps = table.asMaps();  //string olduğu için String.class yazmama gerek yok parantez içine
        for (Map<String, String> map : maps) {
            String userName = map.get("email");
            String password = map.get("password");
            int status = Integer.parseInt(map.get("status"));

        }
    }
}
