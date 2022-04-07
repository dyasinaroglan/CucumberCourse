package gun03;

import gun02.ders.LoginPO;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utils.ParentClass;

import java.util.List;
import java.util.Map;

public class MyStepdefsgun03 extends ParentClass{
    @Given("user write {string}")
    public void userWrite(String text) {
        System.out.println(text);
    }

    @When("user write the followings")
    public void userWriteTheFollowings(DataTable table1) {
        List<String> list1 = table1.asList(String.class);
        System.out.println(list1);
    }

    @When("user write the followings Integers")
    public void userWriteTheFollowingsIntegers(DataTable table2) {
        List<Integer> list2 = table2.asList(Integer.class);
        System.out.println(list2);
        System.out.println(table2);
    }

    @When("ıse write the following integers")
    public void ıseWriteTheFollowingIntegers(DataTable table) {
        List<List<Integer>> lists = table.asLists(Integer.class);
        for (List<Integer> list : lists) {
            System.out.println(list);
            
        }
        System.out.println(lists);
    }

    @When("user login as follows")
    public void userLoginAsFollows(DataTable table) {

        List<List<String>> lists = table.asLists(String.class);
        LoginPO loginPO = new LoginPO();

        for (List<String> list : lists) {
            String userName = list.get(0);
            String password = list.get(1);
            String status = list.get(2);

            loginPO.emailInput.clear();
            loginPO.emailInput.sendKeys(userName);
            loginPO.passwordInput.clear();
            loginPO.passwordInput.sendKeys(password);

            driver.findElement(By.cssSelector("input[type='submit']")).click();

            /*driver.findElement(By.cssSelector("#input-email")).sendKeys(userName);
            driver.findElement(By.cssSelector("#input-password")).sendKeys(password);
            driver.findElement(By.xpath("input[value='Login']")).sendKeys(status);

             */
            if(status.equalsIgnoreCase("0")){
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.alert.alert-danger")));
            }else {
                Assert.assertTrue(driver.getTitle().contains("My Account"));
            }
        }
    }

}
