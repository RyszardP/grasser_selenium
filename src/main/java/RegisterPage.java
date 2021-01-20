import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class RegisterPage {
    public static void main(String[] args) {


        System.setProperty("webdriver.gecko.driver", "D:\\IT\\geckodriver\\geckodriver.exe");

        WebDriver webDriver = new FirefoxDriver();

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();

        webDriver.get("https://grasser.ru/auth/?register=yes");

        //login
        webDriver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/form/div[1]/div[2]/input")).
                sendKeys("Login");

        //password
        webDriver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/form/div[2]/div[2]/input")).
                sendKeys("password");

        //confirm password
        webDriver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/form/div[3]/div[2]/input")).
                sendKeys("password");

        //email
        webDriver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/form/div[4]/div[2]/input")).
                sendKeys("email@email.com");

        //name
        webDriver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/form/div[5]/div[2]/input")).
                sendKeys("Name");

        //second name
        webDriver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/form/div[6]/div[2]/input")).
                sendKeys("Surname");

        //phone
        webDriver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/form/div[7]/div[2]/input")).
                sendKeys("12947345902");

        //checkboxes
        webDriver.findElement(By.xpath("//*[@id='processing']")).click();

    }
}
