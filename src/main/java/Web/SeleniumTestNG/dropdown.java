package Web.SeleniumTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class dropdown {

	@Test
	public static void m1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\eclipse\\wrkspace\\DataDriven\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*
		 * driver.get("http://the-internet.herokuapp.com/dropdown");
		 * 
		 * Select sel= new Select(driver.findElement(By.id("dropdown")));
		 * 
		 * //sel.selectByIndex(2); //sel.selectByValue("1");
		 * sel.selectByVisibleText("Option 2"); Thread.sleep(10000);
		 */

		/*
		 * driver.get("https://www.amazon.in"); Thread.sleep(5000);
		 * driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		 * Thread.sleep(3000); List<WebElement> allElem =
		 * driver.findElements(By.cssSelector("div[class='s-suggestion-container']"));
		 * for (WebElement elem : allElem) {
		 * if(elem.getText().equalsIgnoreCase("mobile stand")) { elem.click(); }
		 * System.out.println(elem.getText());
		 */

		driver.get("https://www.yatra.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("BE_flight_origin_city")).click();
		driver.findElement(By.id("BE_flight_origin_city")).sendKeys("Mum");
		Thread.sleep(3000);
		List<WebElement> allElem = driver.findElements(By.cssSelector("div[class='ac_airport']"));

		for (WebElement elem : allElem) {
			System.out.println(elem.getText());
			

		}
		driver.quit();
	}

}
