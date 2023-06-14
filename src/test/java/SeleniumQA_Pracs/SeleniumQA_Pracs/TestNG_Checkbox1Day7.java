package SeleniumQA_Pracs.SeleniumQA_Pracs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TestNG_Checkbox1Day7 {

	public static void main(String agrs[])
	{
		WebDriver driver = new ChromeDriver();
		
driver.get("https://demoqa.com/automation-practice-form");
driver.manage().window().maximize();
        
        //css Selector
        
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Virat");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Kohli");
       driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("virat@gamil.com");
        driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
       driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("9876543212");
        driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).sendKeys("04022023");
       // driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")).sendKeys("English");
        
                
        //Selecting the first checkbox using XPath
        driver.findElement(By.xpath("//label[text()='Sports']")).click();

        //Selecting the second checkbox using Xpath
        driver.findElement(By.xpath("//label[text()='Reading']")).click();
        driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Hydrabad");
         	  
	}

}
