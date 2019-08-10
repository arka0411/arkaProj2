package Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assert {
	
	public static void main(String args[])
	{
		String dir=System.getProperty("user.dir");
		String path="C:\\Users\\ARKA DUTTA\\Desktop\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
	}

}
