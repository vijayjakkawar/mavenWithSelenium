package com.qa.PageObjectModel.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage {
	
	WebDriver driver;
	
	By Fname = By.xpath("//input[@placeholder='First Name']");
	By Lname = By.xpath("//input[@placeholder='Last Name']");
	By Email = By.xpath("//input[@placeholder='E-Mail Address']");
	By Phone = By.xpath("//input[@placeholder='E-Mail Address']");
	By Address = By.xpath("//input[@placeholder='Address']");
	By City = By.xpath("//input[@placeholder='city']");
	By State = By.xpath("//select[@name='state']");
	By Zipcode = By.xpath("//input[@placeholder='Zip Code']");
	By Domain = By.xpath("//input[@placeholder='Website or domain name']");
	By Host = By.xpath("//input[@value='no']");
	By Description = By.xpath("//textarea[@placeholder='Project Description']");
	By Send = By.xpath("//button[normalize-space()='Send']");
	
	ContactUsPage(WebDriver d)
	{
		driver=d;
	}
	
	public void setFname(By Fname)
	{
		driver.findElements(Fname);
	}
	
	public void setLname(By Lname)
	{
		driver.findElement(Lname);
	}
	
	public void setEmail(By Email)
	{
		driver.findElement(Email);
	}
	
	public void setPhone(By Phone)
	{
		driver.findElement(Phone);
	}
	
	public void setAddress(By address)
	{
		driver.findElement(address);
	}
	
	public void setCity(By City)
	{
		driver.findElement(City);
	}
	
	public void setState(By state)
	{
		driver.findElement(state);
	}
	
	public void setZopcode(By zcode)
	{
		driver.findElement(Zipcode);
	}
	
	public void setDomain(By domain)
	{
		driver.findElement(Domain);
	}
	
	public void clickHost()
	{
		driver.findElement(Host);
	}
	
	public void setDecsription(By dscp)
	{
		driver.findElement(Description);
	}
	
	public void clickSend()
	{
		driver.findElement(Send);
	}
	
	
	
	
	
	
	
	
	
	

	

	
	
	

	
	

}
