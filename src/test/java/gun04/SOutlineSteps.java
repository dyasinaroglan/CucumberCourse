package gun04;

import gun02.ders.LoginPO;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utils.ParentClass;

import java.util.List;
import java.util.Map;

public class SOutlineSteps extends ParentClass {

    int toplam = 0;
    //stepler arasındaki veri transferini class'ın gövdesine yazacağımız
    //bir değişkene hangi stepdeyse o değişkene atarız ve diğer methotta(stepte) kullanabiliriz.


    @When("user add the following numbers")
    public void userAddTheFollowingNumbers(DataTable table) {
        toplam = 0;
        List<Integer> list = table.asList(Integer.class);
        for (Integer num : list) {
            toplam+=num;
        }
    }
    @Given("user write console {string}")
    public void userWriteConsole(String text) {
        System.out.println(text);
    }
    @Then("solution should be {int}")
    public void solutionShouldBe(int num) {
        Assert.assertEquals(toplam, num, "toplam hatalı");
    }
    @When("user add {int} and {int}")
    public void userAddNumberAndNumber(int num1, int num2) {
        toplam = num1+num2;
    }
    LoginPO loginPO = new LoginPO();
    @When("user fill the login form as follows")
    public void userFillTheLoginFormAsFollows(DataTable table) {
        Map<String,String> map = table.asMap();
        loginPO.emailInput.clear();
        loginPO.emailInput.sendKeys(map.get("username"));  // yukarıdaki map dan username çeksin

        loginPO.passwordInput.clear();
        loginPO.passwordInput.sendKeys(map.get("password"));  //yukarıdaki map dan passwordu çeksin

        loginPO.submitButton.click();


    }

    @Then("login should be {string}")
    public void loginShouldBe(String status) {
        if(status.equalsIgnoreCase("true")){
            wait.until(ExpectedConditions.titleContains("My Account"));
            loginPO.eLogoutSide.click();
        }else {
            wait.until(ExpectedConditions.visibilityOf(loginPO.eAlertDanger));
        }
    }
}
