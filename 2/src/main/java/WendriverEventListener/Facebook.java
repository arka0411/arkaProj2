package WendriverEventListener;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebook extends TestBase {
	
	@BeforeTest
	public void setUp()
	{
		String dir=System.getProperty("user.dir");
		String path="C:\\Users\\ARKA DUTTA\\Desktop\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		
		driver=new ChromeDriver();
		eventDriver=new EventFiringWebDriver(driver);
		wdlistener=new WebDriverListener();
		eventDriver.register(wdlistener);/*register the class which has implemented the listener*/
	}	
	@Test
	public void Login() throws InterruptedException
	{
		eventDriver.get("https://www.facebook.com/");
		eventDriver.findElement(By.xpath("//input[@name='email']")).sendKeys("Arka");;
		eventDriver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Password");
		Thread.sleep(8000);
		eventDriver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(9000);
	}

}

	

