import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthPage {

    WebDriver webDriver;

    public AuthPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/div/div/form/div[1]/div[2]/input")
    private WebElement loginField;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/div/div/form/div[2]/div[2]/input")
    private WebElement passwordField;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/div/div/noindex[2]/div/a/b")
    private WebElement registerLink;

    @FindBy(xpath = "//*[@id='USER_REMEMBER']")
    private WebElement rememberMeCheckBox;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/div/div/form/div[4]/input")
    private WebElement buttonEnter;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[1]/h1")
    private WebElement heading;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/div/div/div")
    private WebElement error;

    public RegisterPage clickRegister(){
        registerLink.click();
        return new RegisterPage(webDriver);
    }

    public AuthPage typeLogin(String login){
        loginField.sendKeys(login);
        return this;
    }

    public AuthPage typePassword(String password){
        passwordField.sendKeys(password);
        return this;
    }

    public AuthPage clickCheckBox(){
        rememberMeCheckBox.click();
        return this;
    }

    public AuthPage authWithInvalidCreds(String login, String password){
        this.typeLogin(login);
        this.typePassword(password);
        buttonEnter.click();
        return new AuthPage(webDriver);
    }

    public String getHeadingText(){
        return heading.getText();
    }

    public String getErrorText(){
        return error.getText();
    }
}
