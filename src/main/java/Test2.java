import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Женя on 16.06.2015.
 */
public class Test2 {
    public static WebDriver driver =  new ChromeDriver();

    @Test
    public void test2() throws Exception{
    driver.manage().window().maximize();


        IncorrectLogin loginPage = PageFactory.initElements(driver, IncorrectLogin.class);
        loginPage.classLogin();
        TimeUnit.SECONDS.sleep(2);
        loginPage.typeUserLogin("qwerty");
        loginPage.typePassword("qwerty12345");
        loginPage.clickSubmitButton();
        TimeUnit.SECONDS.sleep(2);
        teardown(driver);
    }

    private static void teardown(WebDriver driver) {


        driver.close();
        driver.quit();
        System.out.println("Test2 Finished");
    }
}