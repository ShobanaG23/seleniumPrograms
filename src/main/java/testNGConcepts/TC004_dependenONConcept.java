package testNGConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC004_dependenONConcept {
public static WebDriver driver;


	@Test(priority=1)
public void login() {
	System.out.println("login test case");
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	System.out.println("orangehrm is opened");
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   //implicit wait
	
	String title= driver.getTitle();
	System.out.println("orangehrm title is :" + title);
	
	Assert.assertEquals(title, "OrangeHRM", "orange hrm application is not openend");
	
	
	driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	
	System.out.println(driver.getTitle());
	System.out.println("orangehrm application is opened");
	
}

	@Test(priority = 2, dependsOnMethods = "login")
public void transfermoney() {
	System.out.println("transfer money");
}

	
	@Test(priority = 3, dependsOnMethods = "login")
public void checkbalance() {
	System.out.println("check balance");
}





}

