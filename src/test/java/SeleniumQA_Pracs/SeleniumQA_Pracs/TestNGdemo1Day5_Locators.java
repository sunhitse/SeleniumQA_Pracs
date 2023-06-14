package SeleniumQA_Pracs.SeleniumQA_Pracs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNGdemo1Day5_Locators {

	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
        
        //ID Locator
        driver.findElement(By.id("userName")).sendKeys("Virat Kohli");
        driver.findElement(By.id("userEmail")).sendKeys("virat@gmail.com");
        driver.findElement(By.id("currentAddress")).sendKeys("Hydrabad");
        driver.findElement(By.id("permanentAddress")).sendKeys("Mumbai"); 
             
        driver.get("https://demoqa.com/automation-practice-form");
        
        //css Selector
        
        driver.findElement(By.cssSelector("#firstName")).sendKeys("Virat");
        driver.findElement(By.cssSelector("#lastName")).sendKeys("Kohli");
        driver.findElement(By.cssSelector("#userEmail")).sendKeys("virat@gamil.com");
        driver.findElement(By.cssSelector("label[for='gender-radio-1']")).click();
        driver.findElement(By.cssSelector("#userNumber")).sendKeys("9876543212");
       // driver.findElement(By.cssSelector("#dateOfBirthInput")).sendKeys("04 April 2023");
       // driver.findElement(By.cssSelector(".subjects-auto-complete__value-container.subjects-auto-complete__value-container--is-multi.css-1hwfws3")).sendKeys("6");
        //driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']")).click();
        //driver.findElement(By.cssSelector("#currentAddress")).sendKeys("Hydrabad");
         	  
	}
	

}
