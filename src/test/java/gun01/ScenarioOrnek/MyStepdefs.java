package gun01.ScenarioOrnek;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utils.ParentClass;
import static gun01.ScenarioOrnek.LocatorsClass.*;

public class MyStepdefs extends ParentClass {
    @Given("navigate to webSite")
    public void navigateToWebSite() {
        openSite(url);
    }

    @When("click sign in button")
    public void clickSignInButton() {
        clickTo(sıgnIn);
    }

    @And("type email {string}")
    public void typeEmail(String email) {
        sendKeys(lemail,email);
    }

    @And("click create and Account button")
    public void clickCreateAndAccountButton() {
        clickTo(createAccount);
    }

    @And("choose title")
    public void chooseTitle() {
        clickTo(gender);
    }

    @And("type firstname {string} and lastname {string}")
    public void typeFirstnameAndLastname(String firstname, String lastname) {
        sendKeys(lfirstName,firstname);
        sendKeys(llastName,lastname);
    }

    @And("type password {string}")
    public void typePassword(String password) {
        sendKeys(lpassword,password);
    }

    @And("type company {string}")
    public void typeCompany(String company) {
        sendKeys(lcompany,company);
    }

    @And("type adress {string}")
    public void typeAdress(String adress) {
        sendKeys(ladress,adress);
    }
}
