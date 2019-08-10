package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementPresent {
	
	public static void main(String args[]) throws Exception
	{
		String dir=System.getProperty("user.dir");
		String path="C:\\Users\\ARKA DUTTA\\Desktop\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement box=driver.findElement(By.xpath("//input[@id='email']"));
		
		WebElement login_btn=driver.findElement(By.xpath("//input[@value='Log In']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].value='Avinash Mishra';", box);
		
		js.executeScript("arguments[0].click();", login_btn);
		
		
	}

}
