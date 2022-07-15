package Web.SeleniumTestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class WebDriverWaits {

	@Test
	public static void m1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\eclipse\\wrkspace\\DataDriven\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //implicite wait implementation
		
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		//Explicit wait 
				WebDriverWait wait = new WebDriverWait(driver,40); 
				WebElement elem= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Click for JS Prompt']")));
				if(elem.isDisplayed()) {
					elem.click();
				}
		System.out.println(driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).getText());
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Alert alt= driver.switchTo().alert(); 
		alt.accept();
		
		
		
		
	}

}
