package SeleniumWebDriverPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC013handlingWebTableConcepts {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		BaseUtil bu = new BaseUtil();
		driver = bu.openBrowser("chrome");
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String appTitle = driver.getTitle();
		
		if (appTitle.equalsIgnoreCase("orangehrm")) {
			System.out.println("orangeHrm browser is opened");
			
			//1. to enter username and password 
			
			
			CommonUtil cu = new CommonUtil();
			cu.enterValueInTextField(driver.findElement(By.id("txtUsername")), "Admin", "Username field");
			cu.enterValueInTextField(driver.findElement(By.id("txtPassword")), "admin123", "Password field");
			cu.clickOnElement(driver.findElement(By.name("Submit")), "login button");
			
			//click on PIM
			
			cu.clickOnElement(driver.findElement(By.linkText("PIM")), "PIM link");
			
			//xpath for getting value in a table
			
			//table[@id='resultTable']/tbody/tr/td[3]--------first name row
			
			//to validate a name inside a row
			//1. get the number of rows
			
			cu.checkVakueInTable(driver, By.xpath("//table[@id='resultTable']/tbody/tr/td[3]"), "Kalpana");
				
				
			}
			
			
			
			
			
			
	}
	}
