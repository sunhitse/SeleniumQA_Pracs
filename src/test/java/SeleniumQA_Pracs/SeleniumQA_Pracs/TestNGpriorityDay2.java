package SeleniumQA_Pracs.SeleniumQA_Pracs;

import org.testng.annotations.Test;

public class TestNGpriorityDay2 {

	@Test(priority=1)
	public void Addition()
	{
		int a = 3;
        int b = 4;
        int Sum = a + b;
        System.out.println("Addition of two numbers " + Sum);
	}
	@Test(priority=2)
	public void Subtraction()
	{
		int a = 8;
        int b = 4;
        int Sub = a - b;
        System.out.println("Sutraction of two numbers " + Sub);
	}
	@Test(priority=3)
	public void Multiplication()
	{
		int a = 12;
        int b = 4;
        int Mul = a * b;
        System.out.println("Multiplication of two numbers " + Mul);
	}
	@Test(priority=-1)
	public void Division()
	{
		int a = 12;
        int b = 4;
        int Div = a / b;
        System.out.println("Division of two numbers " + Div);
	}

}
