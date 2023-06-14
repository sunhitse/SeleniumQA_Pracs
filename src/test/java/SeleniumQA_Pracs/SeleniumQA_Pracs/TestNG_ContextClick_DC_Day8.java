package SeleniumQA_Pracs.SeleniumQA_Pracs;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestNG_ContextClick_DC_Day8 {

	public static void main(String[] args) {

	      
	      // instantiate the driver
		WebDriver driver = new ChromeDriver();
		//specify the URL of the website
		driver.get("https://www.amazon.in/");
		
	       //maximise the window
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]"));

		
		Actions action = new Actions(driver);
		action.doubleClick(element).build().perform();

		//assertEquals(driver.getTitle(), "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in");
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		action.contextClick().build().perform();
		
		
		driver.quit();
		}
}
