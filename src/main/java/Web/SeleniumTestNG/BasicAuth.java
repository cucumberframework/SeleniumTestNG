package Web.SeleniumTestNG;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BasicAuth {

	@Test
	public static void m1() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"F:\\eclipse\\wrkspace\\DataDriven\\BrowserDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // implicite wait implementation
		 driver.get("http://the-internet.herokuapp.com/basic_auth");

		// https://user:password@the-internet.herokuapp.com/basic_auth

		// https://admin:pass123@url

		String user = "admin";
		String pass = "admin";

		String url = "https://" + user + ":" + pass + "@" + "the-internet.herokuapp.com/basic_auth";
		Thread.sleep(5000);
		driver.get(url);
		driver.manage().window().maximize();

	}
}