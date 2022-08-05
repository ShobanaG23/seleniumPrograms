package SeleniumWebDriverPrograms;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;

public class TC002_navigationalCommands {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		BaseUtil bu = new BaseUtil();
		driver = bu.openBrowser("chrome");
		
		/*driver.manage().deleteAllCookies();
		driver.manage().window().maximize();*/
			
		//open google webpage
		driver.get("https://www.google.ca");
		System.out.println("browser is opened");     
		
			
		//capture App Title
		System.out.println("Application title is : " + driver.getTitle());   //google
		
		// open orangeHRm page
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Application title is : "+ driver.getTitle());    //orangehrm
		
		//go back to previous page 
		
		driver.navigate().back();
		System.out.println("Application title is : "+ driver.getTitle());      //google
		
		//navigate to forward page
		driver.navigate().forward();
		System.out.println("Application title is : "+ driver.getTitle());     //orangehrm
		
		//refresh page
		driver.navigate().refresh();
		System.out.println("page is refreshed");
		
	}

}
