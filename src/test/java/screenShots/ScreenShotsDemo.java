package screenShots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotsDemo {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		// To Take Full Page ScreenShot

		TakesScreenshot tss = (TakesScreenshot) driver;
		File fl = tss.getScreenshotAs(OutputType.FILE);
		File target = new File(".\\screenshots\\homepage.png");
		FileUtils.copyFile(fl, target);

		// screenshot of perticular section

		WebElement ele = driver.findElement(By.xpath("//table[@name='BookTable']"));
		File fi1 = ele.getScreenshotAs(OutputType.FILE);
		File target1 = new File(".\\screenshots\\webtable.png");
		FileUtils.copyFile(fi1, target1);
		
		// screenshot of individual element 
		
		WebElement ele1 = driver.findElement(By.xpath("//h1[normalize-space()='Automation Testing Practice']"));
		File fi2 = ele1.getScreenshotAs(OutputType.FILE);
		File target2 = new File(".\\screenshots\\headerTitle.png");
		FileUtils.copyFile(fi2, target2);

		driver.close();

	}

}
