package BaseTest;

import static org.testng.Assert.fail;

import java.util.Date;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentManager {
	public static ExtentReports extent;
	public static ExtentTest test; 
	public static Date d = new Date();

	public static ExtentReports getInstance() {
		
		System.out.println(d.toString());
		String newD=d.toString().replace(":", "_").replace(" ", "_")+".html"; 
		extent=new ExtentReports(System.getProperty("user.dir")+"\\Reports\\"+newD,true,DisplayOrder.NEWEST_FIRST);
	//System.out.println();	
		
		return extent;
		
	}
	
	
	
}
