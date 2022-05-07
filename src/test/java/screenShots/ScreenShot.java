package screenShots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {
	

	// Taking ScreenShot Without Using TypeCasting To TakeScreenShot()
	
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		File f1=driver.getScreenshotAs(OutputType.FILE);
		File target=new File(".\\screenshots\\webpage.png");
		FileUtils.copyFile(f1, target);
		

	}

}
