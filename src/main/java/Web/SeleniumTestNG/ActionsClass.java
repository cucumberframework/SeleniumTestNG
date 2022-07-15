package Web.SeleniumTestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClass {

@Test
public static void m1() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"F:\\eclipse\\wrkspace\\DataDriven\\BrowserDrivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //implicite wait implementation
	driver.get("http://www.amazon.in");
	driver.manage().window().maximize();
	
	/*List<WebElement> allElem= driver.findElements(By.xpath("//img[@alt='User Avatar']")); 
	WebElement elem= allElem.get(2); 
	
	Actions act= new Actions(driver); 
	Thread.sleep(5000);
	
	act.moveToElement(elem).build().perform();*/
	
	WebElement elem =driver.findElement(By.id("twotabsearchtextbox"));
	
	Actions act= new Actions(driver);
	Thread.sleep(5000);
	//act.moveToElement(elem).contextClick().build().perform();
	Action act2=act.moveToElement(elem).click().keyDown(elem,Keys.SHIFT).sendKeys("this is test").keyUp(elem, Keys.SHIFT).build();
	act2.perform();
	
	
	
}
}
