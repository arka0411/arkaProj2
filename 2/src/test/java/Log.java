import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log {
	
	@Test
	public static void TC001()
	{
		String dir=System.getProperty("user.dir");
		String path="C:\\Users\\ARKA DUTTA\\Desktop\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	}

}
