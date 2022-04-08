package gun04;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/gun04"}, //GUN04 un altındaki bütün feature ları çalıştır.
        //src/test/java/gun04/SOLogin.feature -->sadece SOLogin.feature çalışsın
        glue = {"gun04","gun03","gun02"},            //step definisitions ların olduğu yer
        dryRun = false,      // stepler düzgün tanımlanmış mı tanımlanmamış mı ona bakar
        tags = "@LoginTestScenario"  // gun04'ün içerisinde tag'ı LoginTestScenario olanı çalıştır diyorum sadece

)

public class Runner extends AbstractTestNGCucumberTests {   //çalışabilir hale geldi

}
