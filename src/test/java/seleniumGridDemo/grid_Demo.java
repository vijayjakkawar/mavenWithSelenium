package seleniumGridDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class grid_Demo {
	
	/*
	 * grid is a component of a selenium used for executing the test cases remotely
	 * here we follow hub and node concept Hub(Master)----->one hub
	 * Node(slave)--->many number of nodes
	 * 
	 * pre-requisites conditions ---------------------------------- we should have
	 * drivers and browsers on local & remote systems make local system as hub and
	 * register all the VM's (nodes) with hub
	 * 
	 *  1.To convert local system as hub server go to the server jar location and open command prompt there and type 
	 * ( java -jar selenium-server-standalone-3.141.59.jar -role hub ) in command prompt and Enter
	 * -----------------------------------------------------------------------------
	 * -------------------------------------------------- 
	 * 
	 * 	Nodes should register to http://192.168.1.101:4444/grid/register/
	 *  Clients should connect to http://192.168.1.101:4444/wd/hub
	 * 
	 *  3. To check hub is running or not open below link in browser
	 * -----------------------------------------------------------------------------
	 * -- http://localhost:4444/grid/console
	 * 
	 * 2. To register node with hub server go to server jar location and open another command prompt and execute below command 
	 * --------------------------------------------- 
	 * java -Dwebdriver.chromr.driver="C:\Program Files\drivers\chromedriver.exe" -jar
	 * selenium-server-standalone-3.141.59.jar -role node -hub 
	 * http://192.168.1.101:4444/grid/register/
	 * 
	 * 
	 *  1. download selenium server jar..
	 *  2. add jar file to local and remote machines
	 *  3. we need to have same jar on all VM's write test cases and execute on remote systems
	 *  
	 *  1. iam using same machine as hub and node also (windows ----windows)
	 * 
	 */
	
	  WebDriver driver;
	  
		@Test(priority=1)
		void setup() throws MalformedURLException
		{
			
			String nodeURL="http://192.168.1.101:4444/wd/hub";
		    DesiredCapabilities Dcap =new  DesiredCapabilities();
			Dcap.setBrowserName("chrome");
			Dcap.setPlatform(Platform.WIN10);
			
			
			System.setProperty("Webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
			 driver = new RemoteWebDriver(new URL(nodeURL),Dcap);
			driver.manage().window().maximize();
		}
		
		
		@Test(priority=2)
		void login()
		{
			driver.get("http://practice.automationtesting.in/my-account/");
			driver.findElement(By.id("username")).sendKeys("vijay@gmail.com");
			driver.findElement(By.name("password")).sendKeys("@#Vv584529");
			driver.findElement(By.name("login")).click();
			
			String text =driver.findElement(By.xpath("//p[contains(text(),'Hello')]")).getText();
			
			if(text.contains("vijay"))
			{
				System.out.println("my test is pass");
			}
			else
			{
				System.out.println("test is fail");
			}
			
			driver.close();

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


