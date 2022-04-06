package gun02.ders;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class LoginPO {

    public LoginPO(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "i[class='fa fa-user']")
    public WebElement myAccount;

    @FindBy(xpath = "//a[text()='Login']")
    public WebElement loginButtonClick;

    @FindBy(id = "input-email")
    public WebElement emailInput;

    @FindBy(id = "input-password")
    public WebElement passwordInput;

    @FindBy(css = "input[type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "(//a[@class='list-group-item'])[2]")
    public WebElement editAccount;

    @FindBy(id = "input-telephone")
    public WebElement telephoneNumber;

    @FindBy(css = "input[type='submit']")
    public WebElement continueSubmit;

    @FindBy(css = "div[class='alert alert-success alert-dismissible']")
    public WebElement message;

    @FindBy(xpath = "(//a[@class='list-group-item'])[12]")
    public WebElement newsLetter;

    @FindBy(css = "input[value='1']")
    public WebElement yesButton;

    @FindBy(css = "input[value='2']")
    public WebElement noButton;

    @FindBy(css = "input[type='submit']")
    public WebElement continueClick;

    @FindBy(css = "div[class='alert alert-success alert-dismissible']")
    public WebElement successMessage;
}
