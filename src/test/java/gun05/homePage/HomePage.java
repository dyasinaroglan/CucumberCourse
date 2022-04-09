package gun05.homePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ParentClass;

import java.util.List;

public class HomePage extends ParentClass {

    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "input[class='gLFyf gsfi']")
    public WebElement searchInput;

    @FindBy(xpath = "//a//h3")
    public WebElement titles;

    @FindBy(id = "Email")
    public WebElement emailInput;

    @FindBy(css = "input[class='button-1 login-button']")
    public WebElement logInButton;

    @FindBy(css = "div[class='validation-summary-errors']")
    public WebElement errorMessage;
}
