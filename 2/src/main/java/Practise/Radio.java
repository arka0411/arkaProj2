package Practise;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {
	
	public static void main(String args[]) throws InterruptedException
	{
		String dir=System.getProperty("user.dir");
		String path="C:\\Users\\ARKA DUTTA\\Desktop\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> radio=driver.findElements(By.xpath("//input[@type='radio']"));
		
		for(int i=0;i<radio.size();i++)
		{
			String values=radio.get(i).getAttribute("value");
			Thread.sleep(3000);
			System.out.println(values);
		}
		
	}


}
