package testClasses;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomClass.LoginPom;
import baseClass.Utility;
import configurations.ConfigPaths;

public class LoginTestClass {
	
public static void main(String[] args) throws  IOException, InterruptedException {
		
		//Browser configurations
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\newMavenProject\\src\\main\\resources\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.facebook.com/signup");
		
		
		//Object of POM class
		LoginPom s = new LoginPom(driver); //<--constructor call with driver arguments.
		
		
		//TC-01
		s.enterFirstname(Utility.readexcel(1, 0));
		
		s.enterLastname(Utility.readexcel(1, 1));
		
		s.enterEmail(Utility.readexcel(1, 2));
		
		s.confirmEmailId(Utility.readexcel(1, 3));
		
		s.enterPassword(Utility.readexcel(1, 4));
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
		//TC-02
		s.enterFirstname(Utility.readexcel(2, 0));
		
		s.enterLastname(Utility.readexcel(2, 1));
		
		s.enterEmail(Utility.readexcel(2, 2));
		
		s.confirmEmailId(Utility.readexcel(2, 3));
		
		s.enterPassword(Utility.readexcel(2, 4));

}
