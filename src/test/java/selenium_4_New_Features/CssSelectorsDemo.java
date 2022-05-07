package selenium_4_New_Features;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelectorsDemo {
	public static void main(String[] args) {

		/*
		 * Tag and ID        css=tag#id     css=input#email 
		 * Tag and Class     css=tag.class  css=input.inputtext
		 * Tag and Attribute css=tag[attribute=value] css=input[name=lastName] 
		 * Tag, Class, and Attribute  css=tag.class[attribute=value]  css=input.inputtext[tabindex=1]
		 * 
		 * 
		 */

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// selenium 4 new feature is (Duration.ofSeconds(10))
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://console.scoremonster.com/login");
		
		// using locator css selector (Tag With Id)
		driver.findElement(By.cssSelector("input#usernameField-Login")).sendKeys("vijayjakkawar@gmail.com");
		

		// using locator css selector (Tag With Attribute )
		driver.findElement(By.cssSelector("input[id=passwordField-Login]")).sendKeys("@#Vv584529");
		
		// using locator css selector (Tag with class)
		
		driver.findElement(By.cssSelector("button.btn-green")).click();
		
		// using locator css selector (Tag, Class, and Attribute)
		
		driver.findElement(By.cssSelector("a.text-white[id=logoutLink_Navbar]")).click();
		
		
	}

}
