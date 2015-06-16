import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Женя on 16.06.2015.
 */
public class ForgotPassword {
    private WebDriver driver;
    public ForgotPassword(WebDriver driver) {
        this.driver = driver; }


    @FindBy(id = "registration")
    private WebElement UserRegistration;
    @FindBy(id = "id_email")
    private WebElement email;
    @FindBy(id = "submit_btn")
    private WebElement submit;
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
    public void clickSend(WebDriver driver) {

        driver.findElement(By.xpath(".//*[@id='submit_btn']")).click();

    }


}

