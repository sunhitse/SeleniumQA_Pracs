package SeleniumQA_Pracs.SeleniumQA_Pracs;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGdemoDay1 {
	@BeforeTest
	   void BeforeTestAnno()
	   {
	       System.out.println("I am in BeforeTest Annotation");
	   }
	
	@Test
           public void verifyString()
       	{
       		String s1= "Selenium";
       		String s2= "Selenium";
       		Assert.assertEquals(s1, s2);
       	}
       	
       	@Test
       	public void verifyVariableValue()
       	{
       		int x=10;
       		Assert.assertTrue(x>0);
       	}
       	@AfterTest
       	void AfterTestAnno()
        {
            System.out.println("I am in AfterTest Annotation");
        }
}
