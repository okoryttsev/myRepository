import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

/**
 * Created by Женя on 16.06.2015.
 */
public class ForgotPasswordIncUser {
    private WebDriver driver;
    public ForgotPasswordIncUser(WebDriver driver) {
        this.driver = driver; }


    @FindBy(id = "registration")
    private WebElement UserRegistration;
    @FindBy(id = "id_email")
    private WebElement email;
    @FindBy(id = "submit_btn")
    private WebElement submit;
    @FindBy(id="id_captcha_1")
    private WebElement capField;

    public Object inputEmail;

    public void classLogin(){
        driver.navigate().to("https://goantifraud.com/manager");
    }
    public void typeUserLogin(String text) {
        UserRegistration.sendKeys(text);
    }
    public void typePassword(String text) {
        email.sendKeys(text);
    }

    public static void ForgotPassword(WebDriver driver){
        driver.findElement(By.xpath(".//*[@id='registration']/div[1]/span/a")).click();
    }
    public void inputEmail(String text){
        email.sendKeys(text);
    }
    public void WaitForCondition(WebDriver driver) throws InterruptedException {
        String condition="";

        do{
            condition=capField.getText();
            System.out.println(condition);
            TimeUnit.SECONDS.sleep(20);
        }while(condition.length()==4);

        clickSend(driver);
    }
    public void clickSend(WebDriver driver) {

        driver.findElement(By.xpath(".//*[@id='submit_btn']")).click();

    }
}
