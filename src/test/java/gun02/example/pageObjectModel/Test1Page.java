package gun02.example.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class Test1Page {

    public Test1Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@title='T-shirts'])[2]")
    public WebElement clickTshirt;

    @FindBy(css = ".icon-th-list")
    public WebElement clickList;

    @FindBy(css = ".wishlist")
    public WebElement clickWishList;

    @FindBy(css = "p[class='fancybox-error']")
    public WebElement messageInput;

}
