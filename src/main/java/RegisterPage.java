import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class RegisterPage {

    private WebDriver webDriver;

    public RegisterPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private By loginField = By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/form/div[1]/div[2]/input");
    private By passwordField = By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/form/div[2]/div[2]/input");
    private By confirmPasswordField = By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/form/div[3]/div[2]/input");
    private By emailField = By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/form/div[4]/div[2]/input");
    private By nameField = By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/form/div[5]/div[2]/input");
    private By secondNameField = By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/form/div[6]/div[2]/input");
    private By phoneField = By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/form/div[7]/div[2]/input");
    private By agreeCheckBox = By.xpath("//*[@id='processing']");

   public RegisterPage typeLoginField(String login){
       webDriver.findElement(loginField).sendKeys(login);
       return this;
   }

}

