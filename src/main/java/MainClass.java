import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class MainClass {

    static WebDriver webDriver;

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:\\IT\\geckodriver\\geckodriver.exe");

        webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
        webDriver.get("https://grasser.ru/");

        //  MainPage mainPage = new MainPage(webDriver);
        MainPage mainPage = PageFactory.initElements(webDriver, MainPage.class);

        mainPage.clickSignInButton();
    }
}
