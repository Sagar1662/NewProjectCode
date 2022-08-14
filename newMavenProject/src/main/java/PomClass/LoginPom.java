package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPom {
	@FindBy(xpath = "//input[@name='firstname']") 
		private WebElement firstName;
		
		@FindBy(xpath = "//input[@name='lastname']") 
		private WebElement lastName;
		
		@FindBy(xpath = "//input[@name='reg_email__']") 
		private WebElement email;
		
		@FindBy(xpath = "//input[@name='reg_email_confirmation__']") 
		private WebElement confirmEmail;
		
		@FindBy(xpath = "//input[@name='reg_passwd__']") 
		private WebElement password;
		
		
		//constructor
	public LoginPom(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		
		//All methods
		//FistName
		public void enterFirstname(String firstnm)
		{
			firstName.sendKeys(firstnm);
		}
		
		
		//LastName
		public void enterLastname(String lastnm) 
		{
			lastName.sendKeys(lastnm);
		}
		
		
		//EmailId
		public void enterEmail(String emailId)
		{
			email.sendKeys(emailId);
		}
		
		
		//ConfirmEmailId
		public void confirmEmailId(String emailId)
		{
			confirmEmail.sendKeys(emailId);
		}
		
		
		//Password
		public void enterPassword(String pass)
		{
			password.sendKeys(pass);
		}
		
}

