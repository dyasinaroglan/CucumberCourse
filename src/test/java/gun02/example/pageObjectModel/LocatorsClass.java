package gun02.example.pageObjectModel;

import org.openqa.selenium.By;

public interface LocatorsClass {

    By loginButton = By.cssSelector("li[class='active']");
    By luserName = By.cssSelector("input[name='email']");
    By lpassword = By.cssSelector("input[name='password']");
    By lloginClick = By.cssSelector("div[class='ui fluid large blue submit button']");
    By negativeMessage = By.cssSelector("div[class='ui negative message']");

}
