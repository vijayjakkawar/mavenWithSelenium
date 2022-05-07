package dropDownBoxes;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		driver.get("https://admin-demo.nopcommerce.com/Admin/Customer/List");

		// first method

		/*
		 * Select se1= new Select(driver.findElement(By.id("select-demo")));
		 * se1.selectByVisibleText("Wednesday");
		 */

		// Second Method

		/*
		 * Select se = new Select(driver.findElement(By.id("select-demo")));
		 * System.out.println(se.getOptions().size()); List<WebElement> option =
		 * se.getOptions(); for (WebElement opt : option) { if
		 * (opt.getText().equals("Wednesday")) { opt.click(); break; } }
		 */
		
		// third Method selecting multiple dropdowns

		WebElement uname = driver.findElement(By.xpath("//input[@id='Email']"));
		uname.clear();
		uname.sendKeys("admin@yourstore.com");
		WebElement pwd = driver.findElement(By.xpath("//input[@id='Password']"));
		pwd.clear();
		pwd.sendKeys("admin");
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();

		// third Method selecting multiple dropdowns

		WebElement month = driver.findElement(By.id("SearchMonthOfBirth"));
		SelectOptionsFromDropdown(month, "5");
		WebElement date = driver.findElement(By.id("SearchDayOfBirth"));
		SelectOptionsFromDropdown(date, "10");
	}

	public static void SelectOptionsFromDropdown(WebElement ele, String value) {
		Select sc = new Select(ele);
		List<WebElement> alloptions = sc.getOptions();
		for (WebElement option : alloptions) {
			if (option.getText().equals(value)) {
				option.click();
				break;
			}
		}

	}

}
