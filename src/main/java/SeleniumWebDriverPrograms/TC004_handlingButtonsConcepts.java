package SeleniumWebDriverPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC004_handlingButtonsConcepts {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		BaseUtil bu = new BaseUtil();
		driver = bu.openBrowser("chrome");
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String appTitle = driver.getTitle();
		
		if (appTitle.equalsIgnoreCase("orangehrm")) {
			System.out.println("orangeHrm browser is opened");
		
			//1.verify button is enabled
			
			CommonUtil cu = new CommonUtil();
			cu.clickOnElement(driver.findElement(By.name("Submit")), "LOGIN");
			
			
			
			
			
			
		} else {
			System.out.println("orangeHRM browser is not opened");
		}
		
	}

}
