package SeleniumWebDriverPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC006_handlingLinkConcept {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BaseUtil bu = new BaseUtil();
		CommonUtil cu = new CommonUtil();
		
		driver = bu.openBrowser("chrome");  //open browser
		driver.get("https://www.facebook.com/");  //open facebook
		
		//1.click on the link
		
				cu.clickOnElement(driver.findElement(By.linkText("Create a Page")), "Create a Page link");
				
				//move back page
				
				driver.navigate().back();
				System.out.println("moved to previous page");
			
				
				//2.verify if link is displayed
				cu.verifyElementExists(driver.findElement(By.linkText("Forgot password?")), "Forgot password?");
				
				//3.count number of links
				List<WebElement> links = driver.findElements(By.tagName("a"));
				
				
				int noOfLinks = links.size();
				
				System.out.println("number of links present is "+ noOfLinks );
				
				//4. to print all the link names
				
				for(int i=0; i<noOfLinks; i++) {
					WebElement ele = links.get(i);
					String linkName = ele.getText();
				//System.out.println("link name is : "+linkName);
				
					
				//5.print only the link name that is empty
					boolean status=true;
					String expVal = "Create a Page";
					
				//String expVal = "Create a Page";
					/*boolean val = linkName.isEmpty();
					
					if (val == true) {
						//System.out.println(linkName);  //print the empty links
*/					
				//6.check if a link is present or not
					
						
						if (linkName.equalsIgnoreCase(expVal)) {
							status = true;
							
						}else {
							status =false;
						}
						
						if (status == true) {
							
					
							System.out.println(linkName+" pass-link is present"); 
							break;
							
						} else {
							System.out.println(linkName+" fail link is not present");
						}
				}
					
						
				
			
					
	
					//close browser
					bu.closeBrowser();
				}
	}

