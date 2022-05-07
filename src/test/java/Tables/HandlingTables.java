package Tables;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingTables {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");

		WebElement UName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		UName.clear();
		UName.sendKeys("Admin");
		WebElement pwd = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		pwd.clear();
		pwd.sendKeys("admin123");

		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

		int rows = driver.findElements(By.xpath("//table[@id='resultTable']//tbody/tr")).size();
		System.out.println("Total No Of Rows" + rows);

		int cols = driver.findElements(By.xpath("//table[@id='resultTable']//tbody/tr[1]/td")).size();
		System.out.println("Total No Of cols" + cols);

		String value = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[1]/td[2]")).getText();
		System.out.println(value);

		// 1. Retreving the All Values In Tables

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= cols; j++) {
				String data = driver
						.findElement(By.xpath("//table[@id='resultTable']//tbody/tr[" + i + "]/td[" + j + "]"))
						.getText();
				System.out.print("  " + data + "  ");
			}
			System.out.println();
		}

		driver.close();

		// 2.to click each check box in the table

		/*
		 * for (int i = 1; i <= rows; i++) { for (int j = 1; j <= cols; j++) {
		 * 
		 * driver.findElement(By.xpath("//table[@id='resultTable']//tbody//tr[" + i +
		 * "]/td[1]")).click();
		 * 
		 * }
		 * 
		 * }
		 */

		// 3. clicking on the chech box when fifth coloumn value is enabled

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= cols; j++) {
				String enableValue = driver
						.findElement(By.xpath("//table[@id='resultTable']//tbody//tr[" + i + "]//td[5]")).getText();
				if (enableValue.equals("Enabled")) {
					driver.findElement(By.xpath("//table[@id='resultTable']//tbody//tr[" + i + "]/td[1]")).click();
				}

			}
		}

	}

}
