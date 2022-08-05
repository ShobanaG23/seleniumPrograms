
package testNGConcepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC005_propertiesConcepts {
	public static WebDriver driver;
	
	@Test
	public void login() throws IOException {
		
		
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\rarav\\eclipse-workspace\\SeliniumPrograms\\src\\main\\java\\testNGConcepts\\config.properties");
		prop.load(fis);
		
		
		//read the values
		String url = prop.getProperty("siturl");
		String uname = prop.getProperty("username");
		String pwd = prop.getProperty("password");
		
		//prront the values
		
		System.out.println(url);
		System.out.println(uname);
		System.out.println(pwd);
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get(url); //sit environment
		System.out.println("orangehrm is opened");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   //implicit wait
		
		String title= driver.getTitle();
		System.out.println("orangehrm title is :" + title);
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM", "orange hrm application is not openend");
		
		
		driver.findElement(By.name("txtUsername")).sendKeys(uname);
		driver.findElement(By.name("txtPassword")).sendKeys(pwd);
		//driver.findElement(By.id("btnLogin")).click();
		System.out.println("orangehrm application is opened");
		}
	
	
	
	
}
