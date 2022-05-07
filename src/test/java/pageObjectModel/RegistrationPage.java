package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

			/*	This Is The One Method Of Creating The Page Object Model
			 *  but this is not the 100% page object model
			 * 
			 */
		
		// in this class identifying the elements only
		// This class contains only registration page elements
		
		WebDriver driver;
		By RegLink=By.linkText("REGISTER");
		By FirstName=By.xpath("//input[@name='firstName']");
		By LastName=By.xpath("//input[@name='lastName']");
		By Phone=By.xpath("//input[@name='phone']");
		By Email=By.xpath("//input[@id='userName']");
		By Address=By.xpath("//input[@name='address1']");
		By City=By.xpath("//input[@name='city']");
		By State=By.xpath("//input[@name='state']");
		By PostalCode=By.xpath("//input[@name='postalCode']");
		By UserName=By.xpath("//input[@id='email']");
		By Password=By.xpath("//input[@name='password']");
		By ConPassword=By.xpath("//input[@name='confirmPassword']");
		By Submit=By.xpath("//input[@name='submit']");
		
	
		RegistrationPage(WebDriver  d)
		{
			driver=d;
		}
	
		
		
		public void  clickRegLink()
		{
			driver.findElement(RegLink).click();
		}	
		
		public void setFirstName(String fname)
		{
			driver.findElement(FirstName).sendKeys(fname);
		}
		public void setLastName(String Lname)
		{
			driver.findElement(LastName).sendKeys(Lname);
		}	
		public void setPhone(String phone)
		{
			driver.findElement(Phone).sendKeys(phone);
		}	
		public void setEmail(String mail)
		{
			driver.findElement(Email).sendKeys(mail);
		}	
		public void setAddress(String address)
		{
			driver.findElement(Address).sendKeys(address);
		}	
		public void setCity(String city)
		{
			driver.findElement(City).sendKeys(city);
		}	
		public void setState(String state)
		{
			driver.findElement(State).sendKeys(state);
		}	
		public void setPostalCode(String pcode)
		{
			driver.findElement(PostalCode).sendKeys(pcode);
		}	
		public void setUserName(String Uname)
		{
			driver.findElement(UserName).sendKeys(Uname);
		}	
		public void setPassword(String pwd)
		{
			driver.findElement(Password).sendKeys(pwd);
		}	
		public void setConPassword(String cpwd)
		{
			driver.findElement(ConPassword).sendKeys(cpwd);
		}	
		public void clickSubmit()
		{
			driver.findElement(Submit).click();
		}	
	
	
		
	
	}


