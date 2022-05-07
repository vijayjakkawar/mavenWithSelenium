package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class RegistrationPage1 {
	// SECOND WAY OF LOCATING ELEMENTS
	WebDriver driver;
	
	// syntax 1
	@FindBy(how=How.LINK_TEXT, using="REGISTER")
	WebElement RegLink;
	
	@FindBy(how=How.XPATH, using="//input[@name='firstName']")
	WebElement FirstName;
	
/*	
 *  	//  Syntax 2  this syntax is preffered 
 
	@FindBy(xpath="//input[@name='firstName']")
	 WebElement FirstName;
*/ 
	 
	  
	 @FindBy(xpath="//input[@name='lastName']")
	 WebElement LastName;
	 
	 @FindBy(xpath="//input[@name='phone']")
	 WebElement Phone;
	 
	 
	 @FindBy(xpath="//input[@id='userName']")
	 WebElement Email;
	 
	 @FindBy(xpath="//input[@name='address1']")
	 WebElement Address;
	 
	 @FindBy(xpath="//input[@name='city']")
	 WebElement City;
	 
	 @FindBy(xpath="//input[@name='state']")
	 WebElement State;
	 
	 @FindBy(xpath="//input[@name='postalCode']")
	 WebElement PostalCode;
	 
	@FindBy(xpath="//input[@id='email']")
	WebElement UserName;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@name='confirmPassword']")
	WebElement conPassword;
	
	@FindBy(xpath="//input[@name='submit']")
	WebElement Submit;
	
	RegistrationPage1(WebDriver d)	
	{
		driver=d;
		PageFactory.initElements(d, this);   // we need to add  additional method  in this model
	}
	
	public void clickRegLink()
	{
		RegLink.click();
	}
	
	public void setFirstName(String vijay)
	{
		FirstName.sendKeys("vijay");
	}
	
	public void setLastName(String ja)
	{
		LastName.sendKeys("jakkawar");
	}
	
	public void setPhone(String ph)
	{
		Phone.sendKeys("9502589165");
	}
	
	public void setEmail(String mail)
	{
		Email.sendKeys("vijay@gmail.com");
	}
	
	public void setAddress(String add)
	{
		Address.sendKeys("telangana");
	}
	
	public void setCity(String city)
	{
		City.sendKeys("hyderaad");
	}
	
	public void setState(String state)
	{
		State.sendKeys("telangana");
	}
	
	public void setPostalCode(String pcode)
	{
		PostalCode.sendKeys("503001");
	}
	
	public void setUserName(String uname)
	{
		UserName.sendKeys("vijayjakkawar");
	}
	
	public void setPassword(String pwd)
	{
		Password.sendKeys("123456");
	}
	
	public void setConPassword(String cpwd)
	{
		conPassword.sendKeys("123456");
	}
	
	public void clickSubmit()
	{
		Submit.click();
	}
	
	
	
	
	
	 

	

	
	
	
	
	
	
	
	

}
