package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploading {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		driver.switchTo().frame(driver.findElement(By.id("frame-one1434677811")));
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-6\"]")).sendKeys("vijay");
				
		  WebElement upload =driver.findElement(By.name("RESULT_FileUpload-10"));		
	      
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click();",upload );
		  Thread.sleep(2000);
		  
		  Robot robo=new Robot();
		  // storing the path of the file to upload  
		  StringSelection ss= new StringSelection("C:\\Users\\hp\\Desktop\\PDF\\Websites for automation practice.docx");
		 // copying the path into the clipboard
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		 
		  // pressing the control key
		  robo.keyPress(KeyEvent.VK_CONTROL);
		  // pressing the button v to paste the path of the loaction
		  robo.keyPress(KeyEvent.VK_V);
		  Thread.sleep(2000);
		  
		  // After that must release the control key and buton v
		  robo.keyRelease(KeyEvent.VK_CONTROL);
		  robo.keyRelease(KeyEvent.VK_V);
		  
		  // pressing the enter button 
		  robo.keyPress(KeyEvent.VK_ENTER);
		  // releasing the enter button
		  robo.keyRelease(KeyEvent.VK_ENTER);
		  
		  
		  
		 
		  
		 
		
		
		
		
		
		
		
		
		
		
	}

}
