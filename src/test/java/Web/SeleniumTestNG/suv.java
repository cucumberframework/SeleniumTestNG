package Web.SeleniumTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class suv {

	@Test(dataProvider="getData")
	public void suvTC1(String uName, String PName) {
		System.out.println("This is SUV TC1 login");
		System.out.println(uName+"----"+PName);
	}

	@Parameters({ "URL", "userName" })
	@Test(groups = { "SmokeTest" })
	public void suvTC2(String urlName, String nameOfUser) {
		System.out.println("This is SUV TC 2 login ");
		System.out.println("The name of URL is: " + urlName);
		System.out.println("The name of user is : " + nameOfUser);
	}

	@DataProvider
	public Object[][] getData() {

		Object[][] data = new Object[4][2];
		// set1
		data[0][0] = "user1";
		data[0][1] = "pass1";

		// set2
		data[1][0] = "user2";
		data[1][1] = "pass2";

		// set3
		data[2][0] = "user3";
		data[2][1] = "pass3";

		// set4
		data[3][0] = "user4";
		data[3][1] = "pass4";
		
		return data; 

	}
}
