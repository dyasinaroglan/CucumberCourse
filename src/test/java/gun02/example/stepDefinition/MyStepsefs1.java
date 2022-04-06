package gun02.example.stepDefinition;

import gun02.example.pageObjectModel.Test2Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.ParentClass;

public class MyStepsefs1 extends ParentClass {

    Test2Page test2Page = new Test2Page();

    @And("sıgnIN butonuna tıkla")
    public void sıgnınButonunaTıkla() {
        test2Page.sıgnInButton.click();
    }

    @And("{string} girisi yap")
    public void girisiYap(String email) {
        test2Page.email.sendKeys(email);

    }

    @And("create an account butonuna tıkla")
    public void createAnAccountButonunaTıkla() {
        test2Page.createAnAccount.click();
    }

    @And("Title sec")
    public void titleSec() {
        test2Page.titleClick.click();
    }
    @And("firstname {string} ve lastname {string} gir")
    public void firstnameVeLastnameGir(String firstname, String lastname) {
        test2Page.lfirstName.sendKeys(firstname);
        test2Page.llastname.sendKeys(lastname);
    }


    @And("password {string} gir")
    public void passwordGir(String password) {
        test2Page.lpassword.sendKeys(password);
    }

    @When("company {string} gir")
    public void companyGir(String company) {
        test2Page.lcompany.sendKeys(company);
    }

    @Then("Adres {string} gir")
    public void adresGir(String address) {
        test2Page.laddress.sendKeys(address);
    }

    @Given("websiteye git {string}")
    public void websiteyeGit(String url) {
        driver.get(url);
    }
}
