package SeleniumWebDriverPrograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC010_handlingWindowsConcepts {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		BaseUtil bu = new  BaseUtil();
		driver = bu.openBrowser("chrome");
		
		driver.get("https://www.facebook.com");
		
		String fTitle = driver.getTitle();
		System.out.println("facebook title is : "+ fTitle);
		
		//create new account
		CommonUtil cu = new CommonUtil();
		cu.clickOnElement(driver.findElement(By.linkText("Create new account")), "Create new account field");
		
		Thread.sleep(5000);
		
		//click on cookies policy
		
		cu.clickOnElement(driver.findElement(By.id("cookie-use-link")), "cookies policy link");
		
		//switch to new window
		
		cu.switchToWindow(driver, "second");
		
		//capturing cookies policy age title
		String cookiesPolicyPageName = driver.getTitle();
		System.out.println("cookies policy page title is : " + cookiesPolicyPageName);
		
		//enter name in first name 
		
		cu.switchToWindow(driver, "first");
		
		cu.enterValueInTextField(driver.findElement(By.name("firstname")), "shobana" , "firstname");
				
		driver.quit(); //close all the windows that was automated(run) by selenium
		//driver.close(); //will close the current active age run by selenium
	}

}
