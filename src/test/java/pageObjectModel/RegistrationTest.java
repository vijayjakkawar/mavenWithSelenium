package pageObjectModel;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegistrationTest {

	@Test
	public void verifyFlightReg() {

		System.setProperty("Webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");

	RegistrationPage RgPage=new RegistrationPage(driver);
//		RegistrationPage1 RgPage = new RegistrationPage1(driver);

		RgPage.clickRegLink();
		RgPage.setFirstName("vijay");
		RgPage.setLastName("jakkawar");
		RgPage.setPhone("9502589165");
		RgPage.setEmail("vijay@gmail.com");
		RgPage.setAddress("telangana");
		RgPage.setCity("hyd");
		RgPage.setState("telanana");
		RgPage.setPostalCode("503001");
		RgPage.setUserName("jakkawar vijay");
		RgPage.setPassword("123456");
		RgPage.setConPassword("123456");
		RgPage.clickSubmit();

		// validation

		if (driver.getPageSource().contains("Thank you for registereing")) {
			System.out.println("your registration is sucessfull");
		}

		else {
			System.out.println("your registration failed");
		}

		driver.quit();

	}

}
