package com.qa.PageObjectModel.test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ContactUsPageTest {
	@Test
	public void verifyContactPage()
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/input-form-demo.html");
		
	//	ContactUsPage cp = new ContactUsPage(driver);
		ContactUsPage1 cp = new ContactUsPage1(driver);
		cp.setFname("jakkawar");
		cp.setLname("vijay");
		cp.setEmail("vijay@gmail.com");
		cp.setPhone("95025");
		cp.setAddress("nizmabad");
		cp.setCity("hyderabad");
		cp.setState("telangana");
		cp.setZipcode("503001");
		cp.setDomain("Testing");
		cp.ClickHost();
		cp.setDescription("this is vijsy");
		cp.clickSend();
		
		
		driver.quit();
		
		
		
		
	}

}
