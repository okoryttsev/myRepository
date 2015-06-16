import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Женя on 16.06.2015.
 */
public class Test3 {
    private static WebDriver driver = new ChromeDriver();

    @Test
    public void test3() throws Exception{

        ForgotPassword forgotPassword = PageFactory.initElements(driver, ForgotPassword.class);
        forgotPassword.classLogin();
        forgotPassword.ForgotPassword(driver);
        forgotPassword.inputEmail("tt");
        TimeUnit.SECONDS.sleep(15);
        forgotPassword.clickSend(driver);
        TimeUnit.SECONDS.sleep(10);
        teardown(driver);
    }

    private static void teardown(WebDriver driver) {
        driver.close();
        driver.quit();
        System.out.println("Test3 Finished");
    }
}
