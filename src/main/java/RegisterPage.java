import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {

    private WebDriver webDriver;

    public RegisterPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[1]/h1")
    private WebElement heading;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/div/div/form/div[1]/div[2]/input")
    private WebElement loginField;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/div/div/form/div[2]/div[2]/input")
    private WebElement passwordField;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/div/div/form/div[3]/div[2]/input")
    private WebElement confirmPasswordField;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/div/div/form/div[4]/div[2]/input")
    private WebElement emailField;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/div/div/form/div[5]/div[2]/input")
    private WebElement nameField;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/div/div/form/div[6]/div[2]/input")
    private WebElement secondNameField;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/div/div/form/div[7]/div[2]/input")
    private WebElement phoneField;

    @FindBy(xpath = "//*[@id='processing']")
    private WebElement agreeCheckBox;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/div/div/form/div[9]/input")
    private WebElement registerButton;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/div/div/div[1]")
    private WebElement loginError;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/div/div/div[2]")
    private WebElement passwordError;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/div/div/div[3]")
    private WebElement confirmPasswordError;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/div/div/div[4]")
    private WebElement emailError;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/div/div/div[5]")
    private WebElement phoneError;


    public RegisterPage typeLogin(String login) {
        loginField.sendKeys(login);
        return this;
    }

    public RegisterPage typePassword(String password) {
      passwordField.sendKeys(password);
        return this;
    }

    public RegisterPage typeConfirmPassword(String password) {
        confirmPasswordField.sendKeys(password);
        return this;
    }

    public RegisterPage typeEmail(String email) {
        emailField.sendKeys(email);
        return this;
    }

    public RegisterPage typeName(String name) {
        nameField.sendKeys(name);
        return this;
    }

    public RegisterPage typeSecondName(String secondName) {
        secondNameField.sendKeys(secondName);
        return this;
    }

    public RegisterPage typePhone(String phone) {
        phoneField.sendKeys(phone);
        return this;
    }

    public RegisterPage clickCheckBox() {
        agreeCheckBox.click();
        return this;
    }

    public RegisterPage registerWithInvalidCreds(String login, String password, String confirmPassword, String email,
                                                 String name, String secondName, String phone) {
        this.typeLogin(login);
        this.typePassword(password);
        this.typeConfirmPassword(confirmPassword);
        this.typeEmail(email);
        this.typeName(name);
        this.typeSecondName(secondName);
        this.typePhone(phone);
        this.clickCheckBox();
        registerButton.click();
        return new RegisterPage(webDriver);
    }

    public String getHeadingText() {
        return heading.getText();
    }

    public String getLoginError() {
        return loginError.getText();
    }

    public String getPasswordError() {
        return passwordError.getText();
    }

    public String getConfirmPasswordError() {
        return confirmPasswordError.getText();
    }

    public String getEmailError() {
        return emailError.getText();
    }

    public String getPhoneError() {
        return phoneError.getText();
    }

}

