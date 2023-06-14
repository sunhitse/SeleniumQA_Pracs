package SeleniumQA_Pracs.SeleniumQA_Pracs;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.json.simple.parser.ParseException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_JsonDemo {

	public static void main(String args[]) throws IOException, Exception
	{
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader("\\Users\\kiran\\eclipse-workspace\\SeleniumQA_Pracs\\src\\test\\java\\Resource\\Read_JSON.json");
		//Read JSON file
		            Object obj = jsonParser.parse(reader);
		            JSONArray usersList = (JSONArray) obj;
		            System.out.println("Users List-> "+usersList); //This prints the entire json file
		            for(int i=0;i<usersList.size();i++) 
		            {
		            JSONObject users = (JSONObject) usersList.get(i);
		            System.out.println("Users -> "+users);//This prints every block - one json object
		            JSONObject user = (JSONObject) users.get("users");
		            System.out.println("User -> "+user); //This prints each data in the block
		            String username = (String) user.get("username");
		            String password = (String) user.get("password");
		            loginApplication(username, password);
	}

}
	public static void loginApplication(String username, String password)
	{
		WebDriver driver = new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("username");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
}
