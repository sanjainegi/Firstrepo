package package002;

import org.testng.annotations.Test;


public class TestClass001 {
	
	@Test
	public void Method1()
	{
		System.out.println("method1 printing its value");
		System.out.println("let add method 1 new entry");
		System.out.println("let add method 1 new entry second entry");
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
		System.out.println("checking conflict changes ll");


	}
	
	@Test
	public void Method4()
	{
		if(System.getProperty("lastname").equalsIgnoreCase("negi"))
			System.out.println("negi last name");
		
		else if(System.getProperty("lastname").equalsIgnoreCase("singh"))
			System.out.println("singh last name");
		else
			System.out.println(System.getProperty("lastname"));

		System.out.println(System.getProperty("country"));
		
		

	}


	

}
