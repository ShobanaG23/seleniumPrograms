package SeleniumWebDriverPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC005_EnterDetailsAndClickLogin {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		BaseUtil bu =  new BaseUtil();
		driver = bu.openBrowser("chrome");
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String appTitle = driver.getTitle();
		System.out.println("Application title is : "+ appTitle);
		
		if (appTitle.equalsIgnoreCase("orangehrm")) {
			System.out.println("orangeHRM browser is opened");
			
			CommonUtil cu = new CommonUtil();
			cu.enterValueInTextField(driver.findElement(By.id("txtUsername")), "Admin", "UserName field");
			cu.enterValueInTextField(driver.findElement(By.id("txtPassword")), "admin123", "Password field");
			
			cu.clickOnElement(driver.findElement(By.name("Submit")), "LOGIN");
			
		} else {

			System.out.println("orangeHRM browser is not opened");
		}
		
		
		
	}

}
