package SeleniumWebDriverPrograms;

import org.jsoup.select.Evaluator.Id;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC003_HandlingInputFields {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		BaseUtil bu = new BaseUtil();
		driver = bu.openBrowser("chrome");
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String appTitle = driver.getTitle();
		
		if (appTitle.equalsIgnoreCase("orangehrm")) {
			System.out.println("orangeHrm browser is opened");
			
			//1. to enter username and password 
			
			
			CommonUtil cu = new CommonUtil();
			cu.enterValueInTextField(driver.findElement(By.id("txtUsername")), "Admin", "Username field");
			cu.enterValueInTextField(driver.findElement(By.id("txtPassword")), "admin123", "Password field");
			
			//2.CAPTURING THE VALUE IN INPUT FIELD
			
			String uname = driver.findElement(By.id("txtUsername")).getAttribute("value");
			System.out.println("username entered is : "+uname);
			
			if(uname.equals("Admin"))
			{
				System.out.println("value entered is same in input field");
			} else {
				System.out.println("value entered is not same in input field");
			}
			
			
			//3.clear the fields 
			
			//driver.findElement(By.id("txtUsername")).clear();
			
									
		} else {
			System.out.println("orangeHRM browser is not opened");
		}
		
		
		
	}

}
