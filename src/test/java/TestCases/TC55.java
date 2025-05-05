package TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.classfile.InnerClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import BaseTest.screenshot;
import FrameworkAnnotations.FrameworkAnnotations;
import FrameworkAnnotations.utils;

@Listeners(FrameworkAnnotations.class)
public class TC55 extends utils {

	@Test(dataProvider = "getData", dataProviderClass = FrameworkAnnotations.class)
	public void login(Hashtable<String, String> table) throws IOException, InterruptedException {
		navigate(table, table.get("url"));
		SendKeys(By.xpath("//input[@name='email']"), table.get("userName"));
		SendKeys(By.xpath("//input[@name='password']"), table.get("password"));

		click(By.xpath("//div[@class='ui fluid large blue submit button']"));

		boolean present = isElementDisplayed(By.xpath("//i[@class='settings icon']"));

		click(By.xpath("//a[@href='/contacts']"));
		click(By.xpath("//i[@class='edit icon']"));
		SendKeys(By.xpath("//input[@name='first_name']"), table.get("firstName"));
		SendKeys(By.xpath("//input[@name='last_name']"), table.get("lastName"));
		SendKeys(By.xpath("//input[@placeholder='Email address']"), table.get("email"));
		SendKeys(By.xpath("//textarea[@name='description']"), table.get("description"));
		click(By.xpath("//i[@class='save icon']"));

	}

}
