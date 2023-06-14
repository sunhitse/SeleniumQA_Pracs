package SeleniumQA_Pracs.SeleniumQA_Pracs;

import org.testng.annotations.Test;

public class TestNGdependsOnmethodDay2 {

	@Test
	public void Addition()
	{
		int a = 3;
        int b = 4;
        int Sum = a + b;
        System.out.println("Addition of two numbers " + Sum);
	}
	@Test(dependsOnMethods="Addition")
	public void Subtraction()
	{
		int a = 8;
        int b = 4;
        int Sub = a - b;
        System.out.println("Sutraction of two numbers " + Sub);
	}
	@Test(dependsOnMethods="Subtraction")
	public void Multiplication()
	{
		int a = 12;
        int b = 4;
        int Mul = a * b;
        System.out.println("Multiplication of two numbers " + Mul);
	}
	@Test(dependsOnMethods="Multiplication")
	public void Division()
	{
		int a = 12;
        int b = 4;
        int Div = a / b;
        System.out.println("Division of two numbers " + Div);
	}

}
