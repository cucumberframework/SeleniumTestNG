package Web.SeleniumTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityExample {

	@Test(priority=1, dependsOnMethods= {"loginToApp"})
	public void studentName() { 
		System.out.println("Print all names of student");
	}
	
	@Test(priority=0)
	public void loginToApp() { 
		Assert.assertEquals(true, false);
		System.out.println("Login to the application");
	}
	
	@Test(priority=2,dependsOnMethods= {"loginToApp"})
	public void getRollNumber() { 
		System.out.println("Print all roll Number");
	}
	
}
