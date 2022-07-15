package Web.SeleniumTestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class car {

	@Parameters({"URL", "userName"})
	@Test(groups= {"SmokeTest"})
	public void login(String urlName, String UsetName) { 
		System.out.println("THis is login test");
		System.out.println("URL is : "+urlName);
		System.out.println("User name is :"+UsetName);
	}
	
	@Test(groups= {"SmokeTest"})
	public void logout() { 
		System.out.println("This is logout test");
	}
}
