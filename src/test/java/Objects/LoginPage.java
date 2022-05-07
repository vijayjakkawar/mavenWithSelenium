package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage()
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//input[@id='input-email']")
    WebElement userID;

    @FindBy(xpath="//input[@id='input-password']")
    WebElement password;

    @FindBy(xpath="//input[@value='Login']")
    WebElement btnLogin;


    public void enterUserId(String id)
    {
      userID.sendKeys(id);

    }

    public void enterpassword(String pwd)
    {
        password.sendKeys(pwd);
    }

    public void Login()
    {
        btnLogin.click();
    }

}
