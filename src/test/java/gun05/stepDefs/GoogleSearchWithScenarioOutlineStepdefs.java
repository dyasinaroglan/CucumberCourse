package gun05.stepDefs;

import gun05.homePage.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v85.animation.model.KeyframeStyle;
import org.testng.Assert;
import utils.ParentClass;

import java.util.Locale;

public class GoogleSearchWithScenarioOutlineStepdefs extends ParentClass {

    HomePage homePage = new HomePage();

    @Given("user navigate to {string}")
    public void userNavigateTo(String url) {
        homePage.openSite(url);
    }

    @When("user search for the {string} in google")
    public void userSearchForTheInGoogle(String text) {
        homePage.sendKeysTo(homePage.searchInput,text + Keys.ENTER);
    }

    @Then("user should see results related to {string}")
    public void userShouldSeeResultsRelatedTo(String expected) {
        Assert.assertTrue(homePage.titles.getText().toLowerCase(Locale.ROOT).contains(expected.toLowerCase(Locale.ROOT)));
    }
}
