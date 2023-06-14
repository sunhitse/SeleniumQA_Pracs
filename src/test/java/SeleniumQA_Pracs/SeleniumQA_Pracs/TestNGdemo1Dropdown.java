package SeleniumQA_Pracs.SeleniumQA_Pracs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestNGdemo1Dropdown {

	public static void main(String agrs[])
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		//Step#3- Selecting the dropdown element by locating its id
        Select select = new Select(driver.findElement(By.id("oldSelectMenu")));

        //Step#4- Printing the options of the dropdown
        //Get list of web elements
        List<WebElement> lst = select.getOptions();

        //Looping through the options and printing dropdown options
        System.out.println("The dropdown options are:");
        for(WebElement options: lst)
            System.out.println(options.getText());

        //Step#5- Selecting the option as 'Purple'-- selectByIndex
        System.out.println("Select the Option by Index 5");
        select.selectByIndex(5);
        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());

        //Step#6- Selecting the option as 'Magenta'-- selectByVisibleText
        System.out.println("Select the Option by Text Magenta");
        select.selectByVisibleText("Magenta");
        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());

        //Step#7- Selecting an option by its value
        System.out.println("Select the Option by value 8");
        select.selectByValue("8");
        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());

        driver.quit();
    }

}