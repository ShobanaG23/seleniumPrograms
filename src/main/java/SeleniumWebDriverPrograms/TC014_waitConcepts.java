package SeleniumWebDriverPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*1.hard wait------thread.sleeo()
2.soft wait----1.implicit wait----given after url is opened
				2.explicit wait-----given after url is opened
				
				*
				*/

public class TC014_waitConcepts {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		BaseUtil bu = new  BaseUtil();
		driver = bu.openBrowser("chrome");
		
		driver.get("https://www.facebook.com");
		
		//get title
		String fTitle = driver.getTitle();
		System.out.println("facebook title is : "+ fTitle);
		
		//create new account
		CommonUtil cu = new CommonUtil();
		cu.clickOnElement(driver.findElement(By.linkText("Create new account")), "Create new account field");
		
		//explicit wait
	
		cu.waitForElement(driver, By.name("websubmit"));
		
		
		//enter first nmae
		cu.enterValueInTextField(driver.findElement(By.name("firstname")), "shobana", "firstname field");
		
		
		

	}

}
