package SeleniumQA_Pracs.SeleniumQA_Pracs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestNGsendKeysdemoDay8 {

	public static void main(String[] args) {

		//specify the driver location
				
		//instantiate the driver
		WebDriver driver = new ChromeDriver();
		
		//specify the URL of the webpage
		driver.get("https://www.flipkart.com/");
		
		//maximise the window
		driver.manage().window().maximize();

		//specify the locator of the search box
		WebElement element = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[2]/a/div[1]/div/img"));
		
		//create an object for the Actions class and pass the driver argument 
		Actions action = new Actions(driver);
		
		//pass the product name that has to be searched in the website
		action.sendKeys(element, "mobile phone 5g").build().perform();
		
driver.quit();	
	}
}


