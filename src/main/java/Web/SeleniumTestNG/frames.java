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
public class frames {

	@Test
	public static void m1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\eclipse\\wrkspace\\DataDriven\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		List<WebElement> allFrames= driver.findElements(By.tagName("frame")); 
		System.out.println(allFrames.size());
		
		driver.switchTo().frame(0).switchTo().frame(2); 		
		System.out.println(driver.findElement(By.tagName("body")).getText()); 
		driver.quit();
	}

}
