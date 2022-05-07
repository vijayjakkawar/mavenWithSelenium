package ObjectsTest;

import Objects.LoginPage;
import Objects.indexPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    WebDriver driver;
    indexPage ip =new indexPage();
    LoginPage lp=new LoginPage();

    @BeforeMethod
    public void openbrowser()
    {
        WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         driver.get("https://demo.opencart.com/");

    }

    @Test
    public void login()
    {
       ip.clickMyAccount();
       ip.clickLogin();
       lp.enterUserId("vijayTesting@gmail.com");
       lp.enterpassword("Testing123");
       lp.Login();

    }

}
