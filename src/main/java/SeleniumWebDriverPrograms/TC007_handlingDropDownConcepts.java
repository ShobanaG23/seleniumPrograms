package SeleniumWebDriverPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

public class TC007_handlingDropDownConcepts {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		BaseUtil bu = new BaseUtil();
		CommonUtil cu = new CommonUtil();
		
		driver = bu.openBrowser("chrome");  //open browser
		driver.get("https://www.facebook.com/");  //open facebook
		
		//clicking on create account
		cu.clickOnElement(driver.findElement(By.linkText("Create new account")), "Create new account button");
		
		Thread.sleep(5000);
		
		//enter firstname
		cu.enterValueInTextField(driver.findElement(By.name("firstname")), "shobana", "first Name field");
		cu.enterValueInTextField(driver.findElement(By.name("lastname")), "govindaraju", "last Name field");
		
		/*//1.select value from month key using sendkeys
		driver.findElement(By.name("birthday_month")).sendKeys("nov");
		driver.findElement(By.name("birthday_year")).sendKeys("1987");
		driver.findElement(By.name("birthday_day")).sendKeys("23");
		*/
		//2.using select class
		
		cu.selectValueFromDropDown(driver.findElement(By.name("birthday_month")), "Jul", "month field");
		cu.selectValueFromDropDown(driver.findElement(By.name("birthday_day")), 20, "day field");
		cu.selectValueFromDropDown(driver.findElement(By.name("birthday_year")), "2015", "year field");
		
			//1.select by visible text
		
		/*Select select1 = new Select(driver.findElement(By.name("birthday_month")));
		select1.selectByVisibleText("Apr");
		Select select2 = new Select(driver.findElement(By.name("birthday_year")));
		select2.selectByVisibleText("1990");
		
			//2.select by index
		Select select = new Select(driver.findElement(By.name("birthday_month")));
		select.selectByIndex(7);
		
			//3.select by value
		Select select3 = new Select(driver.findElement(By.name("birthday_day")));
		select3.selectByValue("30");*/
		
		//3.count number of values in dropdown and check if a value is present or not
		
		cu.checkValueInDropDown(driver.findElement(By.name("birthday_day")), "21");
		cu.checkValueInDropDown(driver.findElement(By.name("birthday_month")),"Jul");
		cu.checkValueInDropDown(driver.findElement(By.name("birthday_year")), "2015");
		
	
		
		bu.closeBrowser();
		}

}
