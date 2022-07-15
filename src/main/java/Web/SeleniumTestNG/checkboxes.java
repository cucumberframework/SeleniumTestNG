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
public class checkboxes {

	@Test
	public static void m1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\eclipse\\wrkspace\\DataDriven\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		boolean bul= driver.findElement(By.cssSelector("input[type='checkbox']")).isSelected();
	
		List<WebElement> elem= driver.findElements(By.cssSelector("input[type='checkbox']"));
		System.out.println("is element selected :"+elem.get(1).isSelected());
		
				System.out.println(bul);//	driver.quit();
	}

}
