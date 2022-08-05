package testNGConcepts;
import org.testng.annotations.Test;

//codes in testNG are written within method only
//no need of main argument

public class TC001_testNGCode {
	
	@Test(priority= 2)
	
	public void displayMessage() {
		System.out.println("this is my first testng code");
	}
	
	@Test(priority=1)
	public void addition() {
		int no1=25,no2=85,result;
		result = no1+no2;
		System.out.println(result);
	}
}
