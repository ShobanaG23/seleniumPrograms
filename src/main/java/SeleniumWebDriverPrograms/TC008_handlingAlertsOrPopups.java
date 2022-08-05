package SeleniumWebDriverPrograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC008_handlingAlertsOrPopups {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		BaseUtil bu = new BaseUtil();
		CommonUtil cu = new CommonUtil();
		
		driver = bu.openBrowser("chrome");
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.manage().window().maximize();
		
		cu.clickOnElement(driver.findElement(By.name("proceed")), "sign in button");
		cu.waitForAlert(driver);
		
		//alert--interface
		cu.verifyTextAlert(driver, "Please enter a valid user name");
		
		//click on ok button
		
		cu.handleAlert(driver);   //press enter from keyboard
		//alert.dismiss();  //press escape from keyboard
		
		//enetr username  nad password
		cu.enterValueInTextField(driver.findElement(By.name("login")), "shobana", "username");
		
		
	}

}
