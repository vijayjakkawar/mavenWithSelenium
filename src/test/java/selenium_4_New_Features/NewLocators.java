package selenium_4_New_Features;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class NewLocators {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList/reset/1");

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("")).sendKeys("admin123");
		
	}

}
