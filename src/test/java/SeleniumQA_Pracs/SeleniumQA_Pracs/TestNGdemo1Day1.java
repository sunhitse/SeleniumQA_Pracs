package SeleniumQA_Pracs.SeleniumQA_Pracs;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGdemo1Day1 {

	@BeforeTest
	   void BeforeTestAnno()
	   {
	       System.out.println("I am in BeforeTest Annotation");
	   }
	    @Test
	    void Method1()
	    {
	        System.out.println("Hello Sunil");
	    }
	    @Test
	    void Method2()
	    {
	        int a = 3;
	        int b = 4;
	        int Sum = a + b;
	        System.out.println("Addition of two numbers " + Sum);
	    }
	    @Test
	    void Method3()
	    {
	        int a = 8;
	        int b = 4;
	        int Sub = a - b;
	        System.out.println("Sutraction of two numbers " + Sub);
	    }
	    @Test
	    void Method4()
	    {
	        int a = 12;
	        int b = 4;
	        int Mul = a * b;
	        System.out.println("Multiplication of two numbers " + Mul);
	    }
	    @Test
	    void Method5()
	    {
	        int a = 12;
	        int b = 4;
	        int Div = a / b;
	        System.out.println("Division of two numbers " + Div);
	    }
	    @AfterTest
	   void AfterTestAnno()
	   {
	       System.out.println("I am in AfterTest Annotation");
	   }
	  @BeforeMethod
	   void BeforeMethodAnno()
	   {
	       System.out.println("I am in BeforeMethod Annotation");
	   }
	   @AfterMethod
	   void AfterMethodAnno()
	   {
	       System.out.println("I am in AfterMethod Annotation");
	   }
	 @BeforeClass
	   void BeforeClassAnno()
	   {
	       System.out.println("I am in BeforeClass Annotation");
	   }
	   @AfterClass
	   void AfterClassAnno()
	   {
	       System.out.println("I am in AfterClass Annotation");
	   }
	  @BeforeSuite
	   void BeforeSuiteAnno()
	   {
	       System.out.println("I am in BeforeSuite Annotation");
	   }
	   @AfterSuite
	   void AfterSuiteAnno()
	   {
	       System.out.println("I am in AfterSuite Annotation");
	   }
	}


