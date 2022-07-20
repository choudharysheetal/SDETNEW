package mavenproject_practice;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class PracticeTest1 {
	@Test
	
	public void createCustomer()
	
	
	{
		String Browser= System.getProperty("browser");
		String URL=System.getProperty("url");
		
		System.out.println("......> browser is "+Browser+"........>url is"+URL);
		Reporter.log("Customer Module", true);
	}
	@Test
	
	public void deleteCustomer()
	{
		Reporter.log("Customer Module", true);
		System.out.println("hi");
		System.out.println("hello");
		
	}
	

}
