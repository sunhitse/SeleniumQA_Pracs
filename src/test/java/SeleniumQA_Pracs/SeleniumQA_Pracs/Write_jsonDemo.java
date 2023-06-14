package SeleniumQA_Pracs.SeleniumQA_Pracs;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

public class Write_jsonDemo {

	public void readWriteJSON() throws InterruptedException, IOException, ParseException {
		JSONObject obj = new JSONObject();
		
		obj.put("result","invalid user");
		obj.put("username","doe@abc.com");
		obj.put("password","pwd@1234");
		
		             FileWriter file = new FileWriter("\\Users\\kiran\\eclipse-workspace\\SeleniumQA_Pracs\\src\\test\\java\\Resource\\Write_JSON.json",false); 
                     file.write(obj.toJSONString());
		             file.close();
		             
		             System.out.println("File has been Created");
		            }
	}
