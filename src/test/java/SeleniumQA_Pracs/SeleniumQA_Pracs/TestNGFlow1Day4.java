package SeleniumQA_Pracs.SeleniumQA_Pracs;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNGFlow1Day4 {

  public static void main(String args[]) throws InterruptedException
  {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  //String value = driver.findElement(By.tagName("PIM")).getText();
	  //System.out.println(value);
	  
	//Click Button for PIM
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
	  
	//Click Button for Add Employee
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")).click();
	 
	  driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("King");
	  driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("Virat");
	  driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Kohli");
	  
	  //Click Button for Save
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
	 
	  //String value = driver.findElement(By.tagName("h6")).getText();
	  //System.out.println(value);
	  Assert.assertTrue(true);
  }

}
