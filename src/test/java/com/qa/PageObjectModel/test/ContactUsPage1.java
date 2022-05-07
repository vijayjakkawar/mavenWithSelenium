package com.qa.PageObjectModel.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage1 {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement Fname;
	@FindBy(xpath ="//input[@placeholder='Last Name']")
	WebElement Lname;
	@FindBy(xpath ="//input[@placeholder='E-Mail Address']")
	WebElement Email;
	@FindBy(xpath="//input[@placeholder='(845)555-1212']")
	WebElement Phone;
	@FindBy(xpath = "//input[@placeholder='Address']")
	WebElement Address;
	@FindBy(xpath ="//input[@placeholder='city']")
	WebElement City;
	@FindBy(xpath = "//select[@name='state']")
	WebElement State;
	@FindBy(xpath = "//input[@placeholder='Zip Code']")
	WebElement Zipcode;
	@FindBy(xpath = "//input[@placeholder='Website or domain name']")
	WebElement Domain;
	@FindBy(xpath = "//input[@value='no']")
	WebElement Host;
	@FindBy(xpath = "//textarea[@placeholder='Project Description']")
	WebElement Description;
	@FindBy(xpath = "//button[normalize-space()='Send']")
	WebElement Send;
	ContactUsPage1(WebDriver d)
	{
	driver = d;
	PageFactory.initElements(d, this);   // we need to add  additional method  in this model
    }
	
	public void setFname(String fname)
	{	
		Fname.sendKeys("jakkawar");	
	}
	
	public void setLname(String lname)
	{	
		Lname.sendKeys("vijay");	
	}
	public void setEmail(String email)
	{	
		Email.sendKeys("vijay@gmail.com");	
	}
	public void setPhone(String phone)
	{	
		Phone.sendKeys("9502589165");	
	}
	public void setAddress(String address)
	{	
		Address.sendKeys("nizamabad");	
	}
	public void setCity(String city)
	{	
		City.sendKeys("hyderabd");	
	}
	public void setState(String state)
	{	
		State.sendKeys("Telangana");	
	}
	public void setZipcode(String zcode)
	{	
		Zipcode.sendKeys("503001");	
	}
	public void setDomain(String domain)
	{	
		Domain.sendKeys("Testing");	
	}
	public void ClickHost()
	{	
		Host.click();	
	}
	public void setDescription(String desc)
	{	
		Description.sendKeys("This is contact us page");	
	}
	public void clickSend()
	{	
		Fname.click();	
	}
	
	
	
	
	
	
	
	
	
}
