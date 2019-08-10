package WendriverEventListener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.BeforeTest;

public class TestBase {
	
	public WebDriver driver;
	public EventFiringWebDriver eventDriver;
	public WebDriverListener wdlistener;
	
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

}
