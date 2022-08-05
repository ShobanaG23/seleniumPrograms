package testNGConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Common {
	
		public void enterValueInTextField(WebElement element, String value, String elementName) {
			
			element.clear();
			element.sendKeys(value);
			
			String uname = element.getAttribute("value");
			
			System.out.println("value entered in "+ elementName + " is "+ uname);
			
		}

		
		
		public void clickOnElement(WebElement ele, String ElementName) {

			boolean status = ele.isEnabled();
			
			System.out.println("Element Status : "+status);
			
			if(status==true) {
				System.out.println(ElementName+"  is enabled");
				
				ele.click();
				System.out.println(ElementName+" is clicked ");
				
			}else 
			{
				System.out.println(ElementName+" is not enabled");
			}
		}
			
}