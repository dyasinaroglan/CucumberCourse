package gun02.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utils.Driver;
import utils.ParentClass;
import static gun02.example.pageObjectModel.LocatorsClass.*;

public class MyStepdefs3 extends ParentClass {

    @Given("user is already on login page {string}")
    public void userIsAlreadyOnLoginPage(String url) {
        driver.get(url);
    }

    @When("title of login page is free CRM")
    public void titleOfLoginPageIsFreeCRM() {
        String title = driver.getTitle();
        Assert.assertEquals("Free CRM software for customer relationship management, sales, marketing campaigns and support.",title);
    }
    @And("login click")
    public void loginClick() {
        clickTo(loginButton);
    }

    @Then("user enters {string} and {string}")
    public void userEntersAnd(String userName, String password) {
        sendKeys(luserName, userName);
        wait.until(ExpectedConditions.visibilityOfElementLocated(lpassword));
        sendKeys(lpassword, password);

    }

    @Then("user clicks on login button")
    public void userClicksOnLoginButton() {
        clickTo(lloginClick);
    }

    @Then("user is on home page")
    public void userIsOnHomePage() {
        wait.until(ExpectedConditions.presenceOfElementLocated(negativeMessage));
    }

    @Then("close the browser")
    public void closeTheBrowser() throws InterruptedException {
        Driver.quit();
    }
}
