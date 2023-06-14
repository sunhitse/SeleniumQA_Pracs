package SeleniumQA_Pracs.SeleniumQA_Pracs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNGdemoDay6_Xpath_ways {

	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		driver.get("https://accounts.lambdatest.com/register/");
		driver.manage().window().maximize();
		
		//Xpath using contains
		driver.findElement(By.xpath("//input[contains(@name,'name')]")).sendKeys("AbhiRam");
		//driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("abhiram@gamil.com");
	    //driver.findElement(By.xpath("//input[contains(@id,'uesrpassword')]")).sendKeys("abhi@123");
	    //driver.findElement(By.xpath("//input[contains(@id,'phone')]")).sendKeys("9867543288");
		
		//Xpath Basic
	    //driver.findElement(By.xpath("//input[@name='name']")).sendKeys("AbhiRam");
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abhiram@gamil.com");
	    //driver.findElement(By.xpath("//input[@id='userpassword']")).sendKeys("abhi@123");
		//driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9867543288");
		
		//xpath using Text method---Doubt
		//driver.findElement(By.xpath("//input[text()='userpassword']")).sendKeys("abhi@123");
		
		//xpath using with starts with
	    //driver.findElement(By.xpath("//input[starts-with(@name,'name')]")).sendKeys("AbhiRam");
	    //driver.findElement(By.xpath("//input[starts-with(@id,'email')]")).sendKeys("abhiram@gamil.com");
		driver.findElement(By.xpath("//input[starts-with(@id,'userpassword')]")).sendKeys("abhi@123");
		//driver.findElement(By.xpath("//input[starts-with(@id,'phone')]")).sendKeys("9867543288");
		
		//xpath using Index--Doubt
		//driver.findElement(By.xpath("//input[@id='phone'][]")).sendKeys("9867543288");
		
		//xpath using OR(any one attribute and value should match)
		//driver.findElement(By.xpath("//input[@id=\"phone\" or contains(@name,'abhi')]")).sendKeys("9867543288");
		
		//xpath using AND(Both two attributes and values should match)
		//driver.findElement(By.xpath("//input[@id=\"phone\" and contains(@name,'abhi')]")).sendKeys("9867543288");
		driver.findElement(By.xpath("//input[@id=\"phone\" and contains(@name,'phone')]")).sendKeys("9867543288");
		
	}

}
