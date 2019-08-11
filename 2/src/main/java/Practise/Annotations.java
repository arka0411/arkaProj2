package Practise;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import junit.framework.Assert;

public class Annotations {
	
	@Test(priority=2)
	public void TC001()
	{
		String expected="Arka";
		String actual="Dutta";
		
		System.out.println("Expected");
		
		
	}
	
	@Test(priority=2)
	public void TC002()
	{
		System.out.println("Dashboard");
	}

}
