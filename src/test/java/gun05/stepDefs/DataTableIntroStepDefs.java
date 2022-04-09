package gun05.stepDefs;

import gun05.homePage.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utils.ParentClass;

import java.util.List;

public class DataTableIntroStepDefs extends ParentClass {

    HomePage homePage = new HomePage();

    @Given("Navigate to Website {string}")
    public void navigateToWebsite(String url) {
        homePage.openSite(url);
    }

    @When("user enter invalid email adress")
    public void userEnterEmailAdress(DataTable table) throws InterruptedException {
        List<String> list = table.asList(String.class);
        for (String s : list) {
            homePage.emailInput.clear();
            homePage.sendKeysTo(homePage.emailInput,s);
            homePage.clickTo(homePage.logInButton);
            wait.until(ExpectedConditions.visibilityOf(homePage.errorMessage));

        }
    }
    @Then("User should see a warning")
    public void userShouldSeeAWarning() {
        Assert.assertTrue(homePage.errorMessage.isDisplayed());
        if(homePage.errorMessage.isDisplayed()){
            System.out.println("test tamamlanmıştır");
        }else {
            System.out.println("error mesajı gözükmektedir");
        }
    }
}
