package gun01.loginScenario;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.ParentClass;
import static gun01.loginScenario.LocatorsClass.*;

public class MyStepdefs extends ParentClass {
    @Given("navigate to site")
    public void navigateToSite() {
        driver.get(url);
    }

    @When("click to contact us button")
    public void clickToContactUsButton() {
        clickTo(contactUs);
    }

    @And("click the subject heading button and select")
    public void clickTheSubjectHeadingButtonAndSelect() {
        WebElement element = driver.findElement(selectSubjectHeading);
        selectTo(element,"Customer service");
    }

    @And("Enter email adress")
    public void enterEmailAdress() {
        sendKeys(lemail,"yasinargln264@gmail.com");
    }

    @And("enter order referance")
    public void enterOrderReferance() {
        sendKeys(orderReference,"test devam");
    }

    @And("message write")
    public void messageWrite() {
        sendKeys(lMessage,"test başarılı bir şekilde devam ediyor");
    }

    @And("click to send button")
    public void clickToSendButton() throws InterruptedException {
        sleepTo(2000);
        clickTo(sendButton);
    }

    @Then("check the confirmation message")
    public void checkTheConfirmationMessage() {
        String message = "Your message has been successfully sent to our team.";
        assertion(yourMessage,message);
    }
}
