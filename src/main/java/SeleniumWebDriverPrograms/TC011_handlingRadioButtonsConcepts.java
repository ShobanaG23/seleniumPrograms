package SeleniumWebDriverPrograms;

//xpath

/*-------//tagname[@attribute name = 'attribute value']
eg:
	//input[@value='-1']
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC011_handlingRadioButtonsConcepts {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		BaseUtil bu = new  BaseUtil();
		driver = bu.openBrowser("chrome");
		
		driver.get("https://www.facebook.com");
		
		//get title
		String fTitle = driver.getTitle();
		System.out.println("facebook title is : "+ fTitle);
		
		//create new account
		CommonUtil cu = new CommonUtil();
		cu.clickOnElement(driver.findElement(By.linkText("Create new account")), "Create new account field");
		
		Thread.sleep(5000);
	
		//clicking on radio buttons
		
		cu.clickOnRadioButton(driver, "male");
		
		
		
		
		
		
	}

}
