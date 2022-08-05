package SeleniumWebDriverPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC012_handlingCheckBoxbuttons {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		BaseUtil bu = new  BaseUtil();
		driver = bu.openBrowser("chrome");
		
		driver.get("https://jqueryui.com/checkboxradio/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//move to frames
		
		driver.switchTo().frame(0);
		
		CommonUtil cu = new CommonUtil();
		driver.findElement(By.xpath("//label[@for='checkbox-2']")).click();
		driver.findElement(By.xpath("//label[@for='checkbox-3']")).click();
		//cu.clickOnCheckBox(driver, "4 star");
	}
	
	
}