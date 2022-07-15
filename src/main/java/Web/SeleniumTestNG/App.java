package Web.SeleniumTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App {

	@Test
	public static void m1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\eclipse\\wrkspace\\DataDriven\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		// System.out.println(driver.findElement(By.cssSelector("span[class='nav-line-2
		// nav-progressive-content']")).getAttribute("id"));
		// System.out.println(driver.findElement(By.cssSelector("span[class='nav-line-2
		// nav-progressive-content']")).getTagName());

		System.out.println(
				(driver.findElement(By.cssSelector("span[class='nav-line-2 nav-progressive-content']")).getText()));
		System.out.println(driver.findElement(By.linkText("Amazon Pay")).getText());

		System.out.println(
				"Electronics present or NOT:  " + driver.findElement(By.linkText("Electronics")).isDisplayed());

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("i[class='a-icon a-icon-checkbox']")).click();
		Thread.sleep(15000);
		System.out.println("Checked/unhecked:"
				+ driver.findElements(By.cssSelector("i[class='a-icon a-icon-checkbox']")).get(1).isSelected());
	//	driver.quit();
	}

}
