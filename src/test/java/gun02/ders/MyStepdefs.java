package gun02.ders;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utils.ParentClass;



public class MyStepdefs extends ParentClass {

    LoginPO loginPO = new LoginPO();
    @Given("user goes to {string}")
    public void userGoesTo(String url) {
        driver.get(url);
    }

    @And("user clicks to My Account")
    public void userClicksToMyAccount() {
        loginPO.myAccount.click();
    }

    @And("user clicks login Link")
    public void userClicksLoginLink() {
        loginPO.loginButtonClick.click();
    }

    @And("user clicks to submit button")
    public void userClicksToSubmitButton() {
        loginPO.submitButton.click();
    }

    @Then("login should be successfull")
    public void loginShouldBeSuccessfull() {
        Assert.assertTrue(driver.getTitle().contains("My Account"));
    }

    @When("user input username as {string} AND password as {string}")
    public void userInputUsernameAsANDPasswordAs(String email, String password) {
        loginPO.emailInput.sendKeys(email);
        loginPO.passwordInput.sendKeys(password);
    }

    @Given("user clik edit Account")
    public void userClikEditAccount() {
        loginPO.editAccount.click();
    }

    @Then("user edit telephone number {string}")
    public void userEditTelephoneNumber(String telNo) {
        loginPO.telephoneNumber.clear();
        loginPO.telephoneNumber.sendKeys(telNo);
    }

    @And("user click to continue")
    public void userClickToContinue() {
        loginPO.continueSubmit.click();
    }

    @And("success alert should be vsisible")
    public void successAlertShouldBeVsisible() {
       wait.until(ExpectedConditions.visibilityOf(loginPO.message));
    }

    @Given("user clicks newsletter")
    public void userClicksNewsletter() {
        loginPO.newsLetter.click();
    }

    @Then("user choose {string}")
    public void userChoose(String yesNo) {
        if(yesNo.equalsIgnoreCase("yes")){
            loginPO.yesButton.click();
        }else {
            loginPO.noButton.click();
        }
    }

    @And("user click to Continues")
    public void userClickToContinues() {
        loginPO.continueClick.click();
    }


    @And("success alert should be visible")
    public void successAlertShouldBeVisible() {
        wait.until(ExpectedConditions.visibilityOf(loginPO.successMessage));
    }
}
