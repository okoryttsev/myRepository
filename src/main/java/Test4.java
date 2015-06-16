import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Женя on 16.06.2015.
 */
public class Test4 {
    private static WebDriver driver =  new ChromeDriver();





    @Test
    public void test4() throws Exception{


        ForgotPasswordIncUser forgotPassword=PageFactory.initElements(driver,ForgotPasswordIncUser.class);
        forgotPassword.classLogin();
        forgotPassword.ForgotPassword(driver);
        forgotPassword.inputEmail("tt");
        forgotPassword.WaitForCondition(driver);
//        forgotPassword.clickSend(driver);
//        TimeUnit.SECONDS.sleep(10);
        teardown(driver);
    }

    private static void teardown(WebDriver driver) {
//        driver.close();
        driver.quit();
        System.out.println("Test4 Finished");
    }
}

