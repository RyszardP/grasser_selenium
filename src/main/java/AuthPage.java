import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthPage {

    WebDriver webDriver;

    public AuthPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private By loginField = By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/form/div[1]/div[2]/input");
    private By passwordField = By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/form/div[2]/div[2]/input");
    private By registerLink = By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/noindex[2]/div/a/b");

    public RegisterPage clickRegister(){
        webDriver.findElement(registerLink).click();
        return new RegisterPage(webDriver);
    }

    public AuthPage typeLogin(String login){
        webDriver.findElement(loginField).sendKeys(login);
        return this;
    }

    public AuthPage typePassword(String password){
        webDriver.findElement(passwordField).sendKeys(password);
        return this;
    }
}
