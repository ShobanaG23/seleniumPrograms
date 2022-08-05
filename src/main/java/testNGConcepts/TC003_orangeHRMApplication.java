package testNGConcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SeleniumWebDriverPrograms.BaseUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

//login orangehrm
//verify dashboard link
//click pim---validate add button
//4.logout

public class TC003_orangeHRMApplication {

	public static WebDriver driver;
	
	//login
@Test
	public void login() throws IOException {
	Base bu = new Base();
	driver = bu.openBrowser("chrome");
	
	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream("C:\\Users\\rarav\\eclipse-workspace\\SeliniumPrograms\\src\\main\\java\\testNGConcepts\\config.properties");
	prop.load(fis);
	
	
	String url = prop.getProperty("siturl");
	String uname = prop.getProperty("username");
	String pwd =  prop.getProperty("password");
	
	driver.get(url);
	System.out.println("orangehrm is opened");
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   //implicit wait
	
	/*String title= driver.getTitle();
	System.out.println("orangehrm title is :" + title);*/
	
	Assert.assertEquals(driver.getTitle(), "OrangeHRM", "orange hrm application is not openend");
	
	Common cu = new Common();
	cu.enterValueInTextField(driver.findElement(By.id("txtUsername")), uname, "UserName field");
	cu.enterValueInTextField(driver.findElement(By.id("txtPassword")), pwd, "Password field");
	
	cu.clickOnElement(driver.findElement(By.id("btnLogin")), "LOGIN");
	
	}
	
	/*//verify dashboard link
	@Test(enabled = false)
	public void dasboardLink() {
		
		System.out.println("check dashboard link");
		boolean status = driver.findElement(By.id("menu_dashboard_index")).isDisplayed();
		System.out.println("status"+status);
		Assert.assertTrue(status, "dashboard link is not displayed");
		System.out.println("dashboard link is displayed");
		
			
	}
	
	
	// click pim and validate add button
	@Test(enabled = false)
	public void validateAddBUtton() {
		
		System.out.println("validate add button in pim");
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		boolean Addstatus = driver.findElement(By.name("btnAdd")).isDisplayed();
		System.out.println("status"+Addstatus);
		Assert.assertTrue(Addstatus, "add button is not dipslpayed");
		System.out.println("add button is displayed");
		
		}
	
	
	
	
	
	
	
	
	@AfterMethod
	
	public void logout() {
	driver.close();
	System.out.println("orangehrm applicattion is closed");
	}
	*/
	
	
}
