package Tables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingTables1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://testautomationpractice.blogspot.com/");

		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr")).size();
		
		System.out.println("Total No Of Rows" + rows);

		int cols = driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr[2]//td")).size();
		System.out.println("Total No Of cols" + cols);

		String value = driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr[2]//td[1]")).getText();
		System.out.println(value);

		for(int i=2; i<=rows; i++)
		{
			for(int j=1; j<=cols; j++)
			{
				String data = driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(data+"  ");
			}
			System.out.println();
		}
	
		driver.close();

	}

}
