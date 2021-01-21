import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver webDriver;

    public MainPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    private By signUpButton = By.xpath("/html/body/div[3]/header/div[3]/div/div[3]/div/div[2]/div/a");

    public AuthPage clickSignInButton(){
        webDriver.findElement(signUpButton).click();
        return new AuthPage(webDriver);
    }

}
