package Web.SeleniumTestNG;

import java.util.List;

import org.openqa.selenium.Alert;
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
public class Alerts {

	@Test
	public static void m1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\eclipse\\wrkspace\\DataDriven\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		//Managing simple alert 
		/*driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert art=driver.switchTo().alert();
		art.accept();*/
		
		
		/*//Managing confirmation Alert 
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Alert act=driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(act.getText());
		act.dismiss();*/
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert act=driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(act.getText());
		act.dismiss();
		
		
		
	}

}
