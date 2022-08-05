package SeleniumWebDriverPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_GetCommands {
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		String expectedAppTitle = "OrangeHRM";
		
		BaseUtil bu = new BaseUtil();
		
		driver = bu.openBrowser("chrome");
		
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize(); // maximize the browser
		driver.get("https://opensource-demo.orangehrmlive.com/"); //opening application
		
		//capturing Application title
		String actualAppTitle = driver.getTitle();
		
	System.out.println("Actual application title is ---"+ actualAppTitle);
	System.out.println("expected application title is ---"+ expectedAppTitle);
	
	//check if expected is matching actual value
	
	if(actualAppTitle.equalsIgnoreCase(expectedAppTitle)) {
		System.out.println("Pass----OrangeHRM application is opened");
	}else {
		System.out.println("Fail------OrangeHRM application is not opened");
	}
	

	//to check the url using index
	String actualAppUrl = driver.getCurrentUrl();
	System.out.println("Application URL is ----"+actualAppUrl);
	
	int val = actualAppUrl.indexOf("orangehrmlive");
	System.out.println("---------checking index of url----------");
	System.out.println(val);
	
	if(val>=0) {
		System.out.println("pass----OrangeHRM is present");
	}else {
		System.out.println("Fail-----OrangeHRM is not present---redirected to someother url");
	}
	
	//instead of index we use contains()
	boolean status = actualAppUrl.contains("orangehrmlive");
	System.out.println("--------checking using contains instead of index-----------");
	if(status==true)
	{
		System.out.println("pass----OrangeHRM is present");
	}else {
		System.out.println("Fail-----OrangeHRM is not present---redirected to someother url");
	}
	bu.closeBrowser();
	}

	
	
}
