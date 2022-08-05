package SeleniumWebDriverPrograms;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtil {
	
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
		
	
	
	public void verifyElementExists(WebElement ele, String valToCheck) {		
	
		String eleName = ele.getText();
		System.out.println("element name displayed is "+ eleName);
		
		if (eleName.equalsIgnoreCase(valToCheck)) {
			System.out.println("pass--- "+valToCheck+" exists");
		} else {
			System.out.println("fail--- "+valToCheck+" does not exists");
		}
	}
		
	
	
	public void selectValueFromDropDown(WebElement ele, int indexNo, String dropDownName ) {
		Select select = new Select(ele);
		select.selectByIndex(indexNo);
		System.out.println("value selected from "+dropDownName);
		
		}
	
	public void selectValueFromDropDown(WebElement ele, String val, String dropDownName ) {
		Select select = new Select(ele);
		select.selectByVisibleText(val);
		System.out.println("value selected from "+dropDownName);
		
		}
	
	
	public void checkValueInDropDown(WebElement ele, String expVal) {
		
		Select select = new Select(ele);
		
		List<WebElement> val = select.getOptions();  //get values in a list 
		System.out.println("total number of values are: "+val);
		System.out.println();
			
			//to print all the values in list
		
		for(int i=0;i<val.size();i++) {
			String ddVal=val.get(i).getText();
			System.out.println(ddVal);
			
			//to check if a value is present or not
			
			 
			boolean status;
			
			if (ddVal.equalsIgnoreCase(expVal)) {
				status = true;
				
			}else {
				status= false;
			}
			
			if (status == true) {
				System.out.println("pass--value is present");
				break;
			}else {
				System.out.println("fail----value is not present");
			}
		}
	}
	
	public void verifyTextAlert(WebDriver driver, String valueToCheck) {
	
	Alert alert = driver.switchTo().alert();
	String val = alert.getText();
	System.out.println("alert message dispplayed is : "+val);
	
	if (val.equalsIgnoreCase(valueToCheck)) {
		System.out.println(valueToCheck +" :pass ---message entered matches");
		
	} else {
		System.out.println(valueToCheck+" :fail---message entered doesnt matches");
	}
	}
	
	
	public void handleAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	



public void switchToWindow(WebDriver driver, String whichWindow) {
	
Set<String> ids = driver.getWindowHandles();  //to get window id 

Iterator<String> itr = ids.iterator();  //use iterator concepts because we have multiple windows
String firstWindow = itr.next();
String secondWindow = itr.next();

System.out.println("first window id is: "+ firstWindow);
System.out.println("second window id is: "+ secondWindow);

if(whichWindow.equalsIgnoreCase("first")) {
	driver.switchTo().window(firstWindow);
}else if (whichWindow.equalsIgnoreCase("second")){
	driver.switchTo().window(secondWindow);
	}else {
		System.out.println("please specify correct window name");
	}


}

public void clickOnRadioButton(WebDriver driver, String buttonName) {
	switch(buttonName.toLowerCase()){
	
	case "custom":
		
		driver.findElement(By.xpath("//input[@value = '-1']")).click();
		System.out.println("clicked on custom button");
		break;


	case "male":
		
		driver.findElement(By.xpath("//input[@value = '2']")).click();
		System.out.println("clicked on male button");
		break;
		

	case "female":
		
		driver.findElement(By.xpath("//input[@value = '1']")).click();
		System.out.println("clicked on female button");
		break;
		
	default:
		System.out.println("please enter proper argument value");
		break;
	}
	
}

public void clickOnCheckBox(WebDriver driver, String checkBoxName) {
	
	switch (checkBoxName.toLowerCase()) {
	case "2 Star":
		driver.findElement(By.xpath("//label[@for='checkbox-1']")).click();
		System.out.println("clicked on "+checkBoxName);
		break;

	case "3 Star":
		driver.findElement(By.xpath("//label[@for='checkbox-2']")).click();
		System.out.println("clicked on "+checkBoxName);
		break;
		
	case "4 Star":
		driver.findElement(By.xpath("//label[@for='checkbox-3']")).click();
		System.out.println("clicked on "+checkBoxName);
		break;
		
	case "5 Star":
		driver.findElement(By.xpath("//label[@for='checkbox-4']")).click();
		System.out.println("clicked on "+checkBoxName);
		break;
		
	default:
		System.out.println("please enter correct arguments");
		break;
	}
	
}


public void checkVakueInTable(WebDriver driver, By ele, String ExpValue) {
List<WebElement> rows = driver.findElements(ele);
int noOfRows = rows.size();
System.out.println("size of row is :"+noOfRows);

//2. get the value of every row

for(int i=0;i<noOfRows;i++) {
	String actVal = rows.get(i).getText();
	System.out.println(actVal);
	
//3.check for a value in the row
	boolean status=true;
	if (actVal.equalsIgnoreCase(ExpValue)) {
		status = true;
		
	} else {
		status = false;
		
	}
	
	if (status == true) {
		System.out.println("value is present");
		break;
	} else {
		System.out.println("value is not present");
	}
	
}
}

public void waitForElement(WebDriver driver, By ele) {
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.presenceOfElementLocated(ele));
	
}


public void waitForAlert(WebDriver driver) {
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.alertIsPresent());
}










}