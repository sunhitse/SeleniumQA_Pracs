package allTests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoComplete {

	public static void main(String[] args) {

		//System.setProperty(FrameworkConstants.CHROME_DRIVER_KEY,FrameworkConstants.CHROME_DRIVER_PATH);
		WebDriver driver = new ChromeDriver();		
		driver.get("https://in.yahoo.com/?p=us");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"yschsp\"]"));
		searchBox.sendKeys("selenium");
		searchBox.sendKeys(Keys.ENTER);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		List<WebElement> resultList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@id='uh-search-box']/following-sibling::div//ul/li")));
		////a[@aria-label='Selenium'], //*[@id="web"]/ol/li[1]/div/div[1]/h3/a
		System.out.println("Result no are : "+resultList.size());
		if(resultList.size()>0) {
			
			for(WebElement result:resultList) {
				System.out.println(result.getText());
				if(result.getText().equalsIgnoreCase("selenium download")) {
					System.out.println("To click the result page");
					result.click();
					break;
				}
			}
		}
		else {
			System.out.println("Nothing to select");
		}
		
//		driver.quit();
	}

}
