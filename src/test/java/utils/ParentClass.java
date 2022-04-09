package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ParentClass {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public ParentClass() {
        this.driver = Driver.getDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(20));
        PageFactory.initElements(driver,this);
    }
    public void openSite(String url){
        driver.get(url);
    }
    public void clickTo(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }
    public void clickTo(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
    public void sendKeys(By locator, String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
    }
    public void sendKeysTo(WebElement element, String text){
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
    }
    public void sleepTo(long milis) throws InterruptedException {
        Thread.sleep(milis);

    }
    public void quitDriver() throws InterruptedException {
        Driver.quit();
    }
    public int random(int size){
        return (int) (Math.random()*size);
    }
    public void selectTo(WebElement dropdown, String str){
        Select select = new Select(dropdown);
        select.selectByVisibleText(str);
    }
    public void assertion(By actualLocator, String expected){
                 //sistemin bize vereceği          beklenen
        wait.until(ExpectedConditions.visibilityOfElementLocated(actualLocator));
        WebElement element = driver.findElement(actualLocator);
        Assert.assertEquals(element.getText(),expected);
        System.out.println("my message : " + element.getText());

    }
}
