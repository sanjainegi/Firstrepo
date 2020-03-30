package package002;

import org.testng.annotations.Test;


public class TestClass001 {
	
	@Test
	public void Method1()
	{
		System.out.println("method1 printing its value");
		System.out.println(System.getProperty("country"));
		System.out.println(System.getProperty("lastname"));
		
		
	}
	
	@Test
	public void Method2()
	{
		System.out.println("method2 printing its value");
		System.out.println("method2 printing its value");
		System.out.println("method2 printing its value METHOD 2");
		
		
	}
	
	@Test
	public void Method3()
	{
		System.out.println("method3 printing its value");
	}
	
	@Test
	public void Method4()
	{
		System.out.println("method4 printing its value");
	}


	/*How Maven works is, if you run a command for any of the lifecycle phases, 
	 it executes each default life cycle phase in order, before executing the command itself.

	order of execution

	validate >> compile >> test (optional) >> package >> verify >> install >> deploy

	So when you run the command mvn package, it runs the commands for all lifecycle phases till package

	validate >> compile >> test (optional) >> package

	And as for mvn install, it runs the commands for all lifecycle phases till install, which includes package as well

	validate >> compile >> test (optional) >> package >> verify >> install*/

}
