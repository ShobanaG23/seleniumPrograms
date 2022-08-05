package SeleniumWebDriverPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class TC009_handlingFramesconcepts {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		BaseUtil bu = new BaseUtil();
		CommonUtil cu = new CommonUtil();
		
		driver = bu.openBrowser("chrome");
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();

	

	//need to move inside frames and the capture the name
	
	driver.switchTo().frame(0);
	String dragText = driver.findElement(By.id("draggable")).getText();
	System.out.println("dragtext is :"+dragText);
	
	String dropText = driver.findElement(By.id("droppable")).getText();
	System.out.println("drop text is :"+dropText);
	
	//perform drag and drop-----move inside of frames
	
	Actions actions = new Actions(driver);
	actions.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
	
	driver.switchTo().defaultContent(); //move outside of frames
	//click on contribute and click on cla
	//we need to use "action" class----to move cursors
	
	Thread.sleep(5000);
	
	
	actions.moveToElement(driver.findElement(By.linkText("Contribute"))).build().perform();
	cu.clickOnElement(driver.findElement(By.linkText("CLA")), "CLA link");
	
	driver.navigate().back();
	
	//right click on events
	
	actions.contextClick(driver.findElement(By.linkText("Events"))).build().perform();
	
	//enter some value in search using actions
	
	actions.sendKeys(driver.findElement(By.name("s")),"shobana").build().perform();
	
	//perform click using actions
	
	actions.click(driver.findElement(By.linkText("Draggable"))).build().perform();
	

	
	
	
	
	}

}
