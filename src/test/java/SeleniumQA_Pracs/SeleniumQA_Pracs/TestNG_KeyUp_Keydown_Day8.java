package SeleniumQA_Pracs.SeleniumQA_Pracs;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class TestNG_KeyUp_Keydown_Day8 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.lambdatest.com/");
		
		assertEquals(driver.getTitle(), "Most Powerful Cross Browser Testing Tool Online | LambdaTest");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		Actions act = new Actions(driver);
		// Scroll Down using Actions class
		act.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	      // Scroll Up using Actions class
		act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
	
		driver.close();
	}

}
