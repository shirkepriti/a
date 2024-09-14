package Com.Crm.Pom;



import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Crm.Fileutility.FileUtility;
import Com.Crm.Fileutility.PropertyUtility;


public class LoginPage
{
	//FileUtility ex = new FileUtility();
	PropertyUtility ps = new PropertyUtility();
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	
	private @FindBy(xpath = "//a[text()='Log in']")
	WebElement loginLink;
	
	public WebElement getloginLink()
	{
		return loginLink;	
	}
	private @FindBy(id = "Email")
	WebElement userEmail;
	
	public WebElement getuserEmail()
	{
		return userEmail;	
	}
	private @FindBy(id="Password")
	WebElement userPassword;
	
	public WebElement getuserPassword()
	{
		return userPassword;
	}
	private @FindBy(css = "input[value='Log in']")
	WebElement loginButton;
	
	public WebElement getloginButton()
	{
		return loginButton;
	}
	public void login() throws EncryptedDocumentException, IOException
	{
		getloginLink().click();
		getuserEmail().sendKeys(ps.readDataFromPropertyFile("Username"));
		getuserPassword().sendKeys(ps.readDataFromPropertyFile("Password"));
		getloginButton().click();
	}
}


