package SeleniumQA_Pracs.SeleniumQA_Pracs;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestNG_movetoElement_Day8 {

	public static void main(String[] args) {


		
		WebDriver driver = new ChromeDriver();
		
//specify the LambdaTest URL
		driver.get("https://www.lambdatest.com/");
		
		assertEquals(driver.getTitle(), "Most Powerful Cross Browser Testing Tool Online | LambdaTest");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//specify the locator of the Resources menu
		WebElement element = driver.findElement(By.xpath("//button[normalize-space()='Resources']"));
	
             Actions act = new Actions(driver);
//mouse hover the Resources element
		act.moveToElement(element).build().perform();
		
//specify the locator for the element Blog and click
		driver.findElement(By.xpath("//h3[normalize-space()='Blog']")).click();

		assertEquals(driver.getCurrentUrl(), "https://www.lambdatest.com/blog/");

//verify the page title after navigating to the Blog section

		//assertEquals(driver.getTitle(), "LambdaTest | A Cross Browser Testing Blog");
	
		driver.close();
	}
}
