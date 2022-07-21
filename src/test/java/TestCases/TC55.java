package TestCases;

import java.io.IOException;
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

	@Test(dataProvider = "getTestData")
	public void login(String username, String password) throws IOException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(prop.getProperty("browser"));
		maximize();
		navigate("https://login.salesforce.com/");
		SendKeys(By.id("username"), username);
		SendKeys(By.id("password"),password);
		click(By.id("Login"));

		boolean present = isElementDisplayed(By.linkText("Home"));

		Assert.assertEquals(present, true);
		Assert.assertTrue(true);

	}

	@DataProvider
	public Object[][] getTestData() {
		Object[][] data = new Object[2][2];

		data[0][0] = "rbrahulbarapatre@gmail.com";
		data[0][1] = "Ra9892338563@";
		data[1][0] = "Test@9892";
		data[1][1] = "PasswordTest123";

		return data;

	}

}
