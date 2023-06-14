package SeleniumQA_Pracs.SeleniumQA_Pracs;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;


public class TestNG_sendKeysdemo2_day8 
{
	
	public static void main(String[] args) {

				WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		
		Actions action = new Actions(driver);
	
//specify the locator of the search box
		WebElement elementToType = driver.findElement(By.id("twotabsearchtextbox"));

//pass the name of the product
		action.sendKeys(elementToType, "iphone 13").build().perform();
		
//pass the Enter value through sendKeys
		action.sendKeys(Keys.ENTER).build().perform();
		




//assertEquals(driver.getTitle(), "Amazon.in : iphone");
		driver.close();
	}

}
