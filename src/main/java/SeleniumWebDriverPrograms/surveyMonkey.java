package SeleniumWebDriverPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class surveyMonkey {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		BaseUtil bu =  new BaseUtil();
		driver = bu.openBrowser("chrome");
		
		driver.get("https://www.surveymonkey.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		CommonUtil cu = new CommonUtil();
		
		Actions action = new Actions(driver);
		action.click(driver.findElement(By.linkText("Log in"))).build().perform();
		action.moveToElement(driver.findElement(By.id("username"))).build().perform(); 
		action.sendKeys(driver.findElement(By.id("username")), "rkrishnnatrajan@gmail.com");
		
		
		/*cu.clickOnElement(driver.findElement(By.linkText("Log in")), "log in link");
		Thread.sleep(5000);
		
		cu.clickOnElement(driver.findElement(By.id("onetrust-accept-btn-handler")), "accept all cookies button");
		Thread.sleep(3000);
		
		cu.enterValueInTextField(driver.findElement(By.id("username")), "rkrishnnatrajan@gmail.com", "username field");
		cu.clickOnElement(driver.findElement(By.xpath("xpath =\"(//button[@type = 'submit'])[2]")), "next button");*/
	}

}
