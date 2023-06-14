package SeleniumQA_Pracs.SeleniumQA_Pracs;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNGgetWindowHandle_Day8 {

	public static void main(String args[]) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.naukri.com");
		driver.manage().window().maximize();
		
		// It will return the parent window name as a String
		String parentWindow=driver.getWindowHandle();
		System.out.println("parentWindow");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/section[1]/div/div/div[5]/div[3]/a[1]/img")).click();

		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

		String child_window=I1.next();


		if(!parentWindow.equals(child_window))
		{
		driver.switchTo().window(child_window);

		System.out.println(driver.switchTo().window(child_window).getTitle());

		driver.close();
		}

		}
		//switch to the parent window
		driver.switchTo().window(parentWindow);

		}

	}


