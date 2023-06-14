package SeleniumQA_Pracs.SeleniumQA_Pracs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNGdemo2CheckboxDay7 {

	public static void main(String agrs[])
	{
		WebDriver driver = new ChromeDriver();
		
driver.get("https://demoqa.com/automation-practice-form");
driver.manage().window().maximize();

//Selecting the first checkbox
driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']")).click();

//Selecting the second checkbox
driver.findElement(By.cssSelector("label[for='hobbies-checkbox-2']")).click();
		
//Selecting the last check box
driver.findElement(By.cssSelector("label[for='hobbies-checkbox-3']")).click();
}
}
