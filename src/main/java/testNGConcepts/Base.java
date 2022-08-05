package testNGConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium. WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	public static Base bu;
	
	public WebDriver openBrowser(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("chrome driver is launched");
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
		} else if(browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("edge driver is launched");
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
		} else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("firefox driver is launched");
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		}else {
			System.out.println("enter correct driver name");
		}
	return driver;

}

}