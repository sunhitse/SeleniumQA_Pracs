package SeleniumQA_Pracs.SeleniumQA_Pracs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNGdemo2Day5_Locators {

	public static void main(String args[])
	  {
		  WebDriver driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  
		  		//Click Button for PIM
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
		  
		//Click Button for Add Employee
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")).click();
		 
		 driver.findElement(By.name("firstName")).sendKeys("King");
		 driver.findElement(By.name("middleName")).sendKeys("Virat");
		 driver.findElement(By.name("lastName")).sendKeys("Kohli");
		  
		//css Locator
	        //driver.findElement(By.cssSelector("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).sendKeys("ADN");
	        
		  
		  //Click Button for Save
		 // driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();

		 driver.get("https://demoqa.com/automation-practice-form");
	        
	        //css Selector
	        
		 driver.findElement(By.cssSelector("#firstName")).sendKeys("Virat");
	        driver.findElement(By.cssSelector("#lastName")).sendKeys("Kohli");
	        driver.findElement(By.cssSelector("#userEmail")).sendKeys("virat@gamil.com");
	        driver.findElement(By.cssSelector("label[for='gender-radio-1']")).click();
	        driver.findElement(By.cssSelector("#userNumber")).sendKeys("9876543212");
	       // driver.findElement(By.cssSelector("#dateOfBirthInput")).sendKeys("12-11-1990");
	       // driver.findElement(By.cssSelector(".subjects-auto-complete__value-container.subjects-auto-complete__value-container--is-multi.css-1hwfws3")).sendKeys("6");
	        //driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']")).click();
	        //driver.findElement(By.cssSelector("#currentAddress")).sendKeys("Hydrabad");
	        
}
}
