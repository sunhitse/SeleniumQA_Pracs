package SeleniumQA_Pracs.SeleniumQA_Pracs;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestNG_Mouseclick_Day8 {

	public static void main(String[] args) {

				
		//instantiate the driver
		WebDriver driver = new ChromeDriver();
		
		//specify the URL of the webpage
		driver.get("https://www.amazon.in/");
		
		//maximise the window
		driver.manage().window().maximize();

		//create an object for the Actions class and pass the driver argument 
		Actions action = new Actions(driver);
	
		//specify the locator of the search box in which the product has to be typed
		WebElement elementToType = driver.findElement(By.id("twotabsearchtextbox"));
		
		//pass the value of the product
		action.sendKeys(elementToType, "iphone 13").build().perform();
		
		//specify the locator of the search button
		WebElement elementToClick = driver.findElement(By.name("field-keywords"));

		//perform a mouse click on the search button
		action.click(elementToClick).build().perform();
		
		//verify the title of the website after searching the product
		//assertEquals(driver.getTitle(), "Amazon.in : iphone 13");
		
		driver.quit();
	}

}
