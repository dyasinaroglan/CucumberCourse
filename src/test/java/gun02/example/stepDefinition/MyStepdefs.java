package gun02.example.stepDefinition;

import gun02.example.pageObjectModel.Test1Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utils.ParentClass;

public class MyStepdefs extends ParentClass {

    Test1Page test1Page = new Test1Page();

    @When("click to t-shırt")
    public void clickToTShırt() {
        test1Page.clickTshirt.click();
    }

    @And("click on list view")
    public void clickOnListView() {
        test1Page.clickList.click();
    }

    @And("Press the add to favorites button")
    public void pressTheAddToFavoritesButton() {
        test1Page.clickWishList.click();
    }

    @Then("verify the output message {string}")
    public void verifyTheOutputMessage(String message) {
        wait.until(ExpectedConditions.visibilityOf(test1Page.messageInput));
    }

    @Given("go to url {string}")
    public void goToUrl(String url) {
        driver.get(url);
    }

}
