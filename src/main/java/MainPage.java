import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
    private WebDriver webDriver;

    public MainPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "/html/body/div[3]/header/div[3]/div/div[3]/div/div[2]/div/a")
    private WebElement signUpButton;

    public AuthPage clickSignInButton(){
        signUpButton.click();
        return new AuthPage(webDriver);
    }


}
