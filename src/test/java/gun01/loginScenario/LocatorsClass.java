package gun01.loginScenario;

import org.openqa.selenium.By;

public interface LocatorsClass {

    String url = "http://automationpractice.com/index.php";
    By contactUs = By.cssSelector("a[title='Contact Us']");
    By selectSubjectHeading = By.id("id_contact");
    By lemail = By.id("email");
    By orderReference = By.id("id_order");
    By lMessage = By.id("message");
    By sendButton = By.xpath("(//i[@class='icon-chevron-right right'])[3]");
    By yourMessage = By.cssSelector( "p[class='alert alert-success']");
}
