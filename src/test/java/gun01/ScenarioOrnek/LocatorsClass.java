package gun01.ScenarioOrnek;

import org.openqa.selenium.By;

public interface LocatorsClass {
    String url = "http://automationpractice.com/index.php";
    By sıgnIn = By.cssSelector("a.login");
    By lemail = By.id("email_create");
    By createAccount = By.id("SubmitCreate");
    By gender = By.id("uniform-id_gender2");
    By lfirstName = By.id("customer_firstname");
    By llastName = By.id("customer_lastname");
    By lpassword = By.id("passwd");
    By lcompany = By.id("company");
    By ladress = By.id("address1");
}
