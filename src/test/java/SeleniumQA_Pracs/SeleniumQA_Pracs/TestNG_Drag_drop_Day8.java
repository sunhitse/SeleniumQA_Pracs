package SeleniumQA_Pracs.SeleniumQA_Pracs;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestNG_Drag_drop_Day8 {

	public static void main(String[] args) {

				WebDriver driver = new ChromeDriver();
		
				String URL = "https://the-internet.herokuapp.com/drag_and_drop";
				driver.get(URL);
				
				driver.manage().window().maximize();
				// It is always advisable to Maximize the window before performing DragNDrop action driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//Actions class method to drag and drop 
				Actions builder = new Actions(driver);
				WebElement from = driver.findElement(By.id("column-a"));
				WebElement to = driver.findElement(By.id("column-b")); 
				//Perform drag and drop
				builder.dragAndDrop(from, to).perform();
				//verify text changed in to 'Drop here' box 
				String textTo = to.getText();
				if(textTo.equals("Dropped!")) {
				System.out.println("PASS: File is dropped to target as expected");
				}else {
				System.out.println("FAIL: File couldn't be dropped to target as expected");
				}
				//driver.close();
				}

}
