package gun05.stepDefs;

import gun05.homePage.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import utils.Driver;

import java.util.Locale;

public class GoogleSearchStepdefs {

    HomePage homePage = new HomePage();


    @Given("user navigate to Google {string}")
    public void userNavigateToGoogle(String url) {
        homePage.openSite(url);
    }

    @When("user search for cucumber in google")
    public void userSearchForCucumberInGoogle() {
        homePage.sendKeysTo(homePage.searchInput,"cucumber" + Keys.ENTER);
    }

    @Then("user should see cucumber results in Cucumber")
    public void userShouldSeeCucumberResultsInCucumber() throws InterruptedException {
        Assert.assertTrue(homePage.titles.getText().toLowerCase(Locale.ROOT).contains("cucumber"));

            Driver.quit();
        }
    }

