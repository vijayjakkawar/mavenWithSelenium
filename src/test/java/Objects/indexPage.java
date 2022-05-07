package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class indexPage {

    WebDriver driver;

    public indexPage()
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//a[@title='My Account']")
    WebElement MyAccount;

    @FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")
    WebElement Login;

    public void clickMyAccount()
    {
        MyAccount.click();
    }

    public LoginPage clickLogin()
    {
        clickLogin();
        return new LoginPage();
    }

}
