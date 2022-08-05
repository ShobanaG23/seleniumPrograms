package testNGConcepts;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



//hard assertions-----if assertions is failed , will not proceed with further lines
//soft assertions------if assertion is failed, will proceed with further lines
public class TC002_assertionsConcepts {

		//hard assertion
	@Test
	public void checkValues() {
		String actName = "prathyun", expName ="prathyun";
		Assert.assertEquals(actName, expName);
		System.out.println("hello");
		
		int actNo=10,expNo=10;
		Assert.assertEquals(actNo, expNo);
		System.out.println("hi");

		boolean actStatus = false, expStatus=true;
		/*Assert.assertEquals(actStatus, expStatus, "not same status");
		System.out.println("status is same");*/
		//soft assertion
		
		//boolean actStatus=false;
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(actStatus, expStatus, "status not matching");
		System.out.println("soft assertion--status same");
		
		
		

		double actMileage = 2.3, expMileage = 2.3;
		Assert.assertEquals(actMileage, expMileage, "this is not same number");
		System.out.println("numbers are same");
	
		sa.assertAll();
		
		
		
	}
}