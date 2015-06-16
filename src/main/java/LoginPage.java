import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Женя on 16.06.2015.
 */
public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver; }

    @FindBy(id = "login")
    private WebElement userLogin;
    @FindBy(id = "password")
    private WebElement password;
    @FindBy(id = "submit_btn")
    private WebElement submit;



    public void classLogin(){
        driver.navigate().to("https://goantifraud.com/manager");
    }
    public void typeUserLogin(String text) {
        userLogin.sendKeys(text);
    }
    public void typePassword(String text) {
        password.sendKeys(text);
    }

    public void clickSubmitButton(){
        submit.click();


    }
}
