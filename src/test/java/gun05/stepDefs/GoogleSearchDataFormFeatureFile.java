package gun05.stepDefs;

import gun05.homePage.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import utils.Driver;
import utils.ParentClass;

import java.util.Locale;

public class GoogleSearchDataFormFeatureFile extends ParentClass {

    HomePage homePage = new HomePage();

    @Given("User navigate to Google website {string}")
    public void userNavigateToGoogleWebsite(String url) {
        homePage.openSite(url);
    }

    @When("user search for {string} in google")
    public void userSearchForInGoogle(String text) {
        homePage.sendKeysTo(homePage.searchInput,text + Keys.ENTER);
    }

    @Then("user should see {string} results in Google")
    public void userShouldSeeResultsInCucumber(String ınput) throws InterruptedException {
        Assert.assertTrue(homePage.titles.getText().toLowerCase(Locale.ROOT).contains(ınput.toLowerCase(Locale.ROOT)));
        Driver.quit();
    }
}
