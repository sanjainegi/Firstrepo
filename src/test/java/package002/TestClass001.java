package package002;

import org.testng.annotations.Test;


public class TestClass001 {
	
	@Test
	public void Method1()
	{
		System.out.println("method1 printing its value");
		System.out.println("let add method 1 new entry");
	}
	
	@Test
	public void Method2()
	{
		System.out.println("method2 printing its value");
		System.out.println("let add method 2 new entry");
	}
	
	@Test
	public void Method3()
	{
		System.out.println("method3 printing its value");
		System.out.println("checking conflict changes");
		if(true)
		{
			int a=10;
			int b=12;
			
			int c=a+b;
			
			System.out.println(c);
			System.out.println("adding method");
			
		}
		System.out.println("checking conflict 001 changes");
		
	}

	

}
