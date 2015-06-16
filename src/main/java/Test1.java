import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Женя on 16.06.2015.
 */
public class Test1 {
    public static WebDriver driver = new ChromeDriver();


    @Test
    public void test1() throws InterruptedException {


        driver.manage().window().maximize();

        LoginPage loginPage = new PageFactory().initElements(driver, LoginPage.class);
        loginPage.classLogin();
        TimeUnit.SECONDS.sleep(2);
        loginPage.typeUserLogin("tt");
        loginPage.typePassword("123456");
        loginPage.clickSubmitButton();
        TimeUnit.SECONDS.sleep(10);
        teardown(driver);
    }

    private static void teardown(WebDriver driver) {
        driver.close();
        driver.quit();
        System.out.println("Test1 Finished");
    }
}