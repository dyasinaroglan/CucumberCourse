package gun01;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MyStepdefs {

    String str = "a";

    @Given("I am on the home page")
    public void ıAmOnTheHomePage() {
        System.out.println("user on homepage");
    }

    @When("user clicks to login button")
    public void userClicksToLoginButton() {
        System.out.println("user set str as 'a'");
    }

    @Then("login form should be visible")
    public void loginFormShouldBeVisible() {
        Assert.assertEquals(str,'a');
    }


    @Given("user on home page")
    public void userOnHomePage() {
    }

    @And("user goes to login form")
    public void userGoesToLoginForm() {
    }

    @When("user input username")
    public void userInputUsername() {
    }

    @And("user input password")
    public void userInputPassword() {
    }

    @Then("page title should be My Account")
    public void pageTitleShouldBeMyAccount() {
    }
}
