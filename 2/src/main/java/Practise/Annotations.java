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
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actual, expected);
		System.out.println("After soft assert");
		sa.assertAll();
		
		
	}
	
	@Test(priority=2)
	public void TC002()
	{
		System.out.println("Dashboard");
	}

}
