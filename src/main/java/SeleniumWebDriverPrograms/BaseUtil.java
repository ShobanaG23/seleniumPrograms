package SeleniumWebDriverPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseUtil {
	
	public static WebDriver driver;
	

	public WebDriver openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup(); 
			driver = new ChromeDriver();   // opening chrome browser
			System.out.println("chrome browser is launched");
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
		} else if (browserName.equalsIgnoreCase("edge")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();  //opening edge driver
			System.out.println("Edge browser is launched");
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
		}else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();   //opening firefox browser
			System.out.println("firefox browser is launched");
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
	}else {
		System.out.println("please pass browser anme as chrome/edge/firefox");
	}
		return driver;
	}
		public void closeBrowser() {
			driver.close();
			System.out.println("browser is closed");
		
	}
}
