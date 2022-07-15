package FrameworkAnnotations;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.model.ITest;
import com.relevantcodes.extentreports.model.Log;
import com.relevantcodes.extentreports.model.Test;
import com.relevantcodes.extentreports.model.TestAttribute;

import BaseTest.BaseTest;
import BaseTest.ExtentManager;
import BaseTest.screenshot;

public class FrameworkAnnotations extends BaseTest implements ITestListener {
	public static ExtentReports extent;
	public static ExtentTest test;
	public static WebDriver driver;
	public static String testCaseName;

	@BeforeSuite
	public static void beforeSuite() throws IOException {
		init();
		extent = ExtentManager.getInstance();
		// System.out.println("Before suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite");

		extent.flush();
	}

	@BeforeTest
	public void beforeTest() {
		
		System.out.println("Before Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}

	@BeforeClass
	public void beforeClass() {

		/*if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					System.getProperty("user.dir")+"\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}*/

	}

	@AfterClass
	public void afterClass() {
		/*if (driver != null) {
			driver.quit();

		}*/

	}

	@BeforeMethod
	public void beforeMethod(Method method) {
		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					System.getProperty("user.dir")+"\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		testCaseName = method.getName();
		test = extent.startTest(testCaseName);

		System.out.println("Before Method");
	}

	@AfterMethod
	public void afterMethod() {
		
	//	test.log(LogStatus.FAIL, test.addScreenCapture(screenshot.destinationFileName));
		extent.endTest(test);
		System.out.println("After Method");
		if (driver != null) {
			driver.quit();

		}
		
	}

	public void onTestStart(ITestResult result) {
	System.out.println("Test case name: "+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case which has PASSED is: "+result.getName());
		try {
			screenshot.takeScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.log(LogStatus.PASS, test.addScreenCapture(screenshot.destinationFileName));
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test case which has Failed  is: "+result.getName());
		try {
			screenshot.takeScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.log(LogStatus.FAIL, test.addScreenCapture(screenshot.destinationFileName));
	}

	public void onTestSkipped(ITestResult result) {
		//System.out.println("Test case which has SKIPPED is: "+result.getName());
		test.log(LogStatus.SKIP, "Skipping this test case:"+result.getName()); 
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	 public void onStart(ITestContext context) {
	}

	public void onFinish(ITestContext context) {
		
	}



	

}