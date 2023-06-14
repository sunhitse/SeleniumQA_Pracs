package allTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoubleClick {

public static void main(String[] args) {
		
		//System.setProperty(FrameworkConstants.CHROME_DRIVER_KEY,FrameworkConstants.CHROME_DRIVER_PATH);
		WebDriver driver = new ChromeDriver();		
		driver.get("http://uitestpractice.com/Students/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		//UITestPracticePage.using(driver).doDoubleClick(driver);
		driver.findElement(By.xpath("//button[@name='dblClick']")).click();
		driver.quit();
	}	

}
