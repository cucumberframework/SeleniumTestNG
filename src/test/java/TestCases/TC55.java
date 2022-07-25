package TestCases;

import java.io.IOException;
import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.classfile.InnerClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseTest.screenshot;
import FrameworkAnnotations.FrameworkAnnotations;
import FrameworkAnnotations.utils;

@Listeners(FrameworkAnnotations.class)
public class TC55 extends utils {

	@Test(dataProvider = "getData",dataProviderClass=FrameworkAnnotations.class)
	public void login(Hashtable<String,String > table) throws IOException, InterruptedException {
		
	System.out.println(table);
		//table.get("userName"); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(prop.getProperty("browser"));
		maximize();
		navigate(table.get("url"));
	SendKeys(By.xpath("//), keysToSend);
		click(By.id("Login"));

		boolean present = isElementDisplayed(By.linkText("Home"));

		Assert.assertEquals(present, true);

		Assert.assertTrue(true);


		//Need to add assertion here 

	}

	

}
