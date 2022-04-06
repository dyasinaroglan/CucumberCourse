package gun02.example.pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.nio.file.Watchable;

public class Test2Page {

    public Test2Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "a[class='login']")
    public WebElement sıgnInButton;

    @FindBy(id = "email_create")
    public WebElement email;

    @FindBy(css = "i[class='icon-user left']")
    public WebElement createAnAccount;

    @FindBy(css = "input[value='2']")
    public WebElement titleClick;

    @FindBy(id = "customer_firstname")
    public WebElement lfirstName;

    @FindBy(id = "customer_lastname")
    public WebElement llastname;

    @FindBy(id = "passwd")
    public WebElement lpassword;

    @FindBy(id = "company")
    public WebElement lcompany;

    @FindBy(id = "address1")
    public WebElement laddress;

}
